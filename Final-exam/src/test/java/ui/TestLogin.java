package ui;

import Data.Data;
import Objects.Account;
import Pages.BasePage;
import Pages.IndexPage;
import Pages.LoginPage;
import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestLogin {

    protected WebDriver driver;
    BasePage basePage;
    LoginPage loginPage;
    IndexPage indexPage;
    @BeforeTest
    @Parameters({"browserName"})
    public void setUp(@Optional("chrome") String browserName) {
        basePage = new BasePage(driver);
        driver = basePage.setupDriver(browserName);
        indexPage = new IndexPage(driver);
        indexPage.navigate(Constants.URL_UAT);
        indexPage.clickMakeAppointment();
        loginPage = new LoginPage(driver);
        loginPage.getUrl();
    }

    @AfterTest
    public void tearDown() {
        basePage.cleanUp();
    }

    @Test(priority = 2, groups = {"ui", "regression"}, description = "Verify Login Successfully")
    public void testLoginSuccess() {
        Account standard_acc = Data.getDefaultAccount();
        loginPage.login(standard_acc);

        Assert.assertTrue(loginPage.getUrl().contains("appointment"));
    }

    @Test(priority = 1, groups = {"ui", "regression"}, description = "Verify Login Unsuccessfully")
    public void testLoginInvalidCredentials() {
        Account invalidAccount = new Account();
        invalidAccount.setUsername("nga");
        invalidAccount.setPassword("hong");
        loginPage.login(invalidAccount);

        // get error message
        //compare
    }

}