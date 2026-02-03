package ie.code.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@name='username']") private WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']") private WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
