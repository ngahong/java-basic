package Pages;

import Locators.IndexLocators;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage {
    IndexLocators locators = new IndexLocators();

    public IndexPage(WebDriver driver) {
        super(driver);
    }
    public void clickMakeAppointment() {
        click(locators.BUTTON_MAKE_APPOINTMENT);
    }
}
