package itbootcamp.selenium.domaci.pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage {
    private final String practice_form_page = "https://demoqa.com/automation-practice-form";
    private WebDriver driver;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "firstName")
    public WebElement firstNameField;
    @FindBy(id = "lastName")
    public WebElement lastNameField;
    @FindBy(id = "userEmail")
    public WebElement emailField;
    @FindBy(id="gender-radio-1")
    public WebElement maleButton;
    @FindBy(id = "gender-radio-2")
    public WebElement femaleButton;
    @FindBy(id = "gender-radio-3")
   public WebElement otherField;
    @FindBy(id = "userNumber")
    public WebElement mobileField;
    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirth;
    @FindBy(id = "subjectsInput")
    public WebElement subjectField;
    @FindBy(id = "hobbies-checkbox-2")
    public WebElement readingButton;
    @FindBy(id = "subjects-label")
    public WebElement pictureField;
    @FindBy(id = "uploadPicture")
    public WebElement chooseFile;
    @FindBy(id = "currentAddress")
    public WebElement current_address;
    @FindBy(id = "state")
    public WebElement stateField;
    @FindBy(id = "city")
    public WebElement cityField;
    @FindBy(id ="submit")
    public WebElement submitButton;
    @FindBy (id="example-modal-sizes-title-lg")
    public WebElement thanksForSubmitting;
    @FindBy (id="closeLargeModal")
    public WebElement closeButton;


    public void inputFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);

    }

    public void inputEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void inputGender () {
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;");
        maleButton.click();

    }
    public void inputMobile(String mobile) {
        mobileField.clear();
        mobileField.sendKeys(mobile);
    }

    public void inputDateBirth(String date) {
        dateOfBirth.sendKeys(date);
    }

    public void inputSubject(String subjects) {
        subjectField.sendKeys(subjects);
        subjectField.sendKeys(Keys.ENTER);
    }

    public void inputHobbies(String hobbies) {
        readingButton.sendKeys(Keys.ENTER);
    }

    public void inputPicture(String picture) {
        pictureField.clear();
        pictureField.sendKeys(picture);
    }

    public void inputCurrentAddress(String currentAddress) {
        current_address.clear();
        current_address.sendKeys(currentAddress);
    }
    public void inputState(String state) {
        //stateField.isSelected();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stateField);
       //stateField.click();
        stateField.sendKeys(state);
    }

    public void inputCity(String city) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cityField);
        //cityField.click();
        cityField.sendKeys(city);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
    public void clickOnCloseButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();");
        closeButton.click();
    }

}






