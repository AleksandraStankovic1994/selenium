package itbootcamp.selenium.domaci.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public final static String LOGGED_IN_MESSAGE_CORRECT = "You logged into a secure area!";

    public final static String LOGGED_IN_MESSAGE_INCORRECT = "Your username is invalid!";


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]"));
    }

    public WebElement loggedInGreenConfirmation() {
        return driver.findElement(By.id("flash"));
    }



}
