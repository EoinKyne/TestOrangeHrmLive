package ie.code.testing.tests;

import ie.code.testing.base.BaseTest;
import ie.code.testing.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    protected String username = "Admin";
    protected String pass = "admin123";
    protected String wrongPass = "Admin123";
    private WebDriverWait wait;

    @Test
    void verifyLogin(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.login(username, pass);
        String currentUrl = chromeDriver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"), "Login failed, Dashboard not reached");
    }

    @Test
    void verifyFailedLogin(){
        LoginPage loginPage = new LoginPage(chromeDriver);
        loginPage.login(username, wrongPass);
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions
                           .visibilityOfElementLocated(
                                   By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")));
        WebElement error = chromeDriver
                        .findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"));
        Assert.assertTrue(error.getText().equalsIgnoreCase("Invalid credentials"));
    }
}
