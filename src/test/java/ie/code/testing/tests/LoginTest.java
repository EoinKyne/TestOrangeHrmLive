package ie.code.testing.tests;

import ie.code.testing.base.BaseTest;
import ie.code.testing.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    protected String username = "Admin";
    protected String pass = "admin123";

    @Test
    void verifyLogin(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.login(username, pass);
        String currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"), "Login failed, Dashboard not reached");
    }
}
