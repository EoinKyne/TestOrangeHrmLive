package ie.code.testing.tests;

import ie.code.testing.Utils.WindowsUtils;
import ie.code.testing.base.BaseTest;
import ie.code.testing.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SocialLinksTest extends BaseTest {
    private WebDriverWait wait;
    @Test
    void verifyLinkedInLink(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.loginPageLinkedInLink();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        wait.until(chromeDriver -> chromeDriver.getWindowHandles().size()>1);
        chromeDriver = WindowsUtils.getNewWindowHandle(chromeDriver);
        String currentUrl =  chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("linkedin") && currentUrl.contains("orangehrm"));
    }


    @Test
    void verifyFacebookLink(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.loginPageFacebookLink();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        wait.until(chromeDriver -> chromeDriver.getWindowHandles().size()>1);
        chromeDriver = WindowsUtils.getNewWindowHandle(chromeDriver);
        String currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("facebook") && currentUrl.contains("OrangeHRM"));
    }

    @Test
    void verifyTwitterLink(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.loginPageTwitterLink();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        wait.until(chromeDriver -> chromeDriver.getWindowHandles().size()>1);
        chromeDriver = WindowsUtils.getNewWindowHandle(chromeDriver);
        String currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("x") && currentUrl.contains("orangehrm"));
    }

    @Test
    void verifyYoutubeLink(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.loginPageYoutubeLink();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        wait.until(chromeDriver -> chromeDriver.getWindowHandles().size()>1);
        chromeDriver = WindowsUtils.getNewWindowHandle(chromeDriver);
        String currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("youtube") && currentUrl.contains("OrangeHRMInc"));
    }
}
