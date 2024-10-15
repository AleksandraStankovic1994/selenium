package itbootcamp.selenium.domaci.pom;

import itbootcamp.selenium.domaci.testqa.BaseTest2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestPracticeFormPage extends BaseTest2 {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/automation-practice-form");
    }
    @Test
    public void UserCanLogIn() throws InterruptedException {
        practiceFormPage.inputFirstName("Petar");
        practiceFormPage.inputLastName("Petrovic");
        practiceFormPage.inputEmail("petar@gmail.com");
        // nasli na - https://stackoverflow.com/questions/41541387/selenium-webdriver-click-on-radio-button-not-working
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", practiceFormPage.maleButton);
        practiceFormPage.maleButton.isSelected();
        practiceFormPage.inputMobile("1234567891");
        practiceFormPage.dateOfBirth.click();
        practiceFormPage.inputSubject("English");
        practiceFormPage.inputHobbies("Reading");
        practiceFormPage.inputCurrentAddress("Kangaroo12 Delhi");
        practiceFormPage.inputState("NCR");
        practiceFormPage.inputCity("Delhi");
        practiceFormPage.submitButton.click();
        Assert.assertTrue(practiceFormPage.thanksForSubmitting.isDisplayed());

}
    @Test
    public void UserCanNotLogInWithoutFirstNameandLastName() throws InterruptedException {
        practiceFormPage.inputFirstName("");
        practiceFormPage.inputLastName("");
        practiceFormPage.inputEmail("petar@gmail.com");
        Thread.sleep(1000);
        // nasli na - https://stackoverflow.com/questions/41541387/selenium-webdriver-click-on-radio-button-not-working
        //((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", practiceFormPage.maleButton);
        practiceFormPage.maleButton.isSelected();
        practiceFormPage.inputMobile("1234567891");
        practiceFormPage.dateOfBirth.click();
        practiceFormPage.inputSubject("English");
        practiceFormPage.inputHobbies("Reading");
        practiceFormPage.inputCurrentAddress("Kangaroo12 Delhi");
        practiceFormPage.inputState("NCR");
        practiceFormPage.inputCity("Delhi");
        practiceFormPage.submitButton.isSelected();
        Assert.assertTrue(practiceFormPage.submitButton.isDisplayed());
    }
}
