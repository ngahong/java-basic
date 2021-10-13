package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class selenium {
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
    public void testSimple() {
        try {
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");

            driver.findElement(By.id("login-button")).click();

            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains("inventory"));

            String[] items = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt",
                    "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"};
            ArrayList<String> items_name = new ArrayList<>();
            for (String item : items) {
                item.toLowerCase();
                item.replace(" ", "-");
                items_name.add(item);
            }
            items_name.toArray();

            driver.findElement(By.id("add-to-card-sauce-labs-bike-light")).click();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //driver.findElement(By.id(button_name + items_name)).click();



    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
