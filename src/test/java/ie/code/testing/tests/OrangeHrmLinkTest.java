package ie.code.testing.tests;

import ie.code.testing.base.BaseTest;
import ie.code.testing.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHrmLinkTest extends BaseTest {

    private WebDriverWait wait;

    @Test
    void verifyOrangeHrmIncLink(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.loginPageOrangeHrmIncLink();
        String parentWindow = chromeDriver.getWindowHandle();
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        wait.until(chromeDriver -> chromeDriver.getWindowHandles().size()>1);
        chromeDriver = getNewWindowHandle(parentWindow, chromeDriver);
        String currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("orangehrm"));

    }

    private WebDriver getNewWindowHandle(String parentWindow, WebDriver chromeDriver){
        for (String windowHandle : chromeDriver.getWindowHandles()
        ) {
            if (!windowHandle.equals(parentWindow)){
                chromeDriver.switchTo().window(windowHandle);
                break;
            }
        }
        return chromeDriver;
    }
}
