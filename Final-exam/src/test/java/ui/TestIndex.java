package ui;

import Locators.IndexLocators;
import Pages.BasePage;
import Pages.IndexPage;
import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestIndex {
    protected WebDriver driver;
    BasePage basePage;
    IndexPage indexPage;
    IndexLocators locators;
    @BeforeTest
    @Parameters({"browserName"})
    public void setUp(@Optional("chrome") String browserName) {
        basePage = new BasePage(driver);
        driver = basePage.setupDriver(browserName);
        indexPage = new IndexPage(driver);
        indexPage.navigate(Constants.URL_UAT);
    }

    @AfterTest
    public void tearDown() {
        basePage.cleanUp();
    }

    @Test
    public void testLoginSuccess() {
        indexPage.clickMakeAppointment();
        //Assert.assertTrue(indexPage.getUrl().contains("login"));
    }
}
