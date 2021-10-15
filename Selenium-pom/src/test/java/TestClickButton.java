import Objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestClickButton {
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
    public void testClickButton() {
        try {
            Account standard_acc = new Account();
            standard_acc.setUsername("standard_user");
            standard_acc.setPassword("secret_sauce");
            TestLogin.login(standard_acc);

            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains("inventory"));

            clickButton(1, "add");
            //System.out.println("123");
            clickButton(3, "remove");
            //System.out.println("456");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickButton(int index, String action) {
        String locator = "//div[@class='inventory_item']";
        List<WebElement> elementList = driver.findElements(By.xpath(locator));
        if (index > 0 && index <= elementList.size()) {
            WebElement element = driver.findElement(By.xpath(locator + "[" + index + "]//button"));
            if (element.getText().equalsIgnoreCase("Add to cart") && action.equalsIgnoreCase("add")) {
                element.click();
            }
            if (element.getText().equalsIgnoreCase("Remove") && action.equalsIgnoreCase("remove")) {
                element.click();
            }
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
