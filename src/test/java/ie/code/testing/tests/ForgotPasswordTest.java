package ie.code.testing.tests;

import ie.code.testing.base.BaseTest;
import ie.code.testing.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {


    @Test
    void verifyForgotYourPassword(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.forgotPassword();
        String currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("requestPasswordResetCode"), "Forgot your password failed");
    }
}
