package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ClickButton {
    public static ChromeDriver driver = null;
    public static void main(String[] args){
        driver = new ChromeDriver();
        login("standard_user","secret_sauce");
        String[] items = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"};
        ArrayList<String> items_name = new ArrayList<>();
        for (String item : items) {
            item.toLowerCase();
            items_name.add(item.replace(" ", "-"));
        }
        items_name.toArray();
        for (String itemTest: items_name){
            clickButton(itemTest,"add");
        }
        driver.quit();
    }

    public static void login(String username, String password) {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(username);

        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(password);

        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
    }

    public static void clickButton(String item, String action){
        if(action.equalsIgnoreCase("add")){
            driver.findElement(By.id("add-to-card-" + item)).click();
        }
        if(action.equalsIgnoreCase("remove")){
            driver.findElement(By.id("remove-" + item)).click();
        }
    }

}
