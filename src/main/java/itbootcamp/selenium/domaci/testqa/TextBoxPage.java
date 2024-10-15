package itbootcamp.selenium.domaci.testqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    //Domaci:
    //Otici na https://demoqa.com/ sajt, zatim na elements->text box
    // i testirati popunjavanje forme
    // sa validnim, nevalidnim mail-om i
    // proveriti da li je output ispravan za svako polje
    WebDriver driver;

    public static final String VALID_EMAIL = "emailvalid@gmail.com";

    public static final String INVALID_EMAIL = "email invalid##@@!!";

    public static final String FIELD_ERROR_CLASS = "field-error";

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public void insertFullName(String name) {
        getFullName().sendKeys(name);
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public void sendValidEmail() {
        getEmail().sendKeys(VALID_EMAIL);
    }

    public void sendInvalidEmail() {
        getEmail().sendKeys(INVALID_EMAIL);
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public void fillCurrentAddress(String address) {
        getCurrentAddress().sendKeys(address);
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public void fillPermanenttAddress(String address) {
        getPermanentAddress().sendKeys(address);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public void clickSubmitButton() {
        getSubmitButton().click();
    }

    public String submittedEmail() {
        return driver.findElement(By.id("email")).getText();
    }

    public String getCssClassesForInputEmail() {
        return getEmail().getAttribute("class");
    }

}




