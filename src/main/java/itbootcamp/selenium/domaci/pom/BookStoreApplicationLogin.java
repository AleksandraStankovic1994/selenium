package itbootcamp.selenium.domaci.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreApplicationLogin extends DemoquaLogovanje{
    public BookStoreApplicationLogin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="userName")
    public WebElement userNameField;
    @FindBy (id="password")
    public WebElement passwordField;
    @FindBy(id="login")
    public WebElement logInButton;
    @FindBy (id="newUser")
    public WebElement newUserButton;
    @FindBy (id="submit")
    public WebElement logOutButton;
    @FindBy (tagName = "p")
    public WebElement invalidUsername_or_password;
    public void inputUsername(String username) {
        userNameField.clear();
        userNameField.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnSubmitButton() {
        logInButton.click();
    }
    public void clickOnSubmitButton1(){
        logOutButton.click();
    }

    }



