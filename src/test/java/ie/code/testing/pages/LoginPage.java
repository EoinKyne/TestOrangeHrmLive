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

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    private WebElement forgotPassword;
    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")
    private WebElement linkedInLink;
    @FindBy(xpath = "//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")
    private WebElement facebookLink;

    @FindBy(xpath = "//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']")
    private WebElement twitterLink;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")
    private WebElement youtubeLink;

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

    public void loginPageLinkedInLink(){
        linkedInLink.click();
    }

    public void loginPageFacebookLink() {
        facebookLink.click();
    }

    public void loginPageTwitterLink(){
        twitterLink.click();
    }

    public void loginPageYoutubeLink(){
        youtubeLink.click();
    }

    public void forgotPassword(){
        forgotPassword.click();
    }
}
