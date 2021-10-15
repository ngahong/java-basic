import Objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestLogin {
    public static ChromeDriver driver = null;

    @BeforeClass
    public void setUp() {
        try {
            driver = new ChromeDriver();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testLogin() {
        try {
            Account standard_acc = new Account();
            standard_acc.setUsername("standard_user");
            standard_acc.setPassword("secret_sauce");
            login(standard_acc);

            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains("inventory"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(Account account) {
        driver.get("https://www.saucedemo.com/");
        WebElement input_user = driver.findElement(By.id("user-name"));
        input_user.sendKeys(account.getUsername());
        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(account.getPassword());
        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
