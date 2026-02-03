package ie.code.testing.tests;

import ie.code.testing.base.BaseTest;
import ie.code.testing.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SocialLinksTest extends BaseTest {
    private WebDriverWait wait;
    @Test
    void verifyLinkedInLink(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        String currentUrl =  chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("linkedin"));
    }
}
