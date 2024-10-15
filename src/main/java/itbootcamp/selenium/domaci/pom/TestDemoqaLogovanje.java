package itbootcamp.selenium.domaci.pom;

import itbootcamp.selenium.domaci.testqa.BaseTest1;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemoqaLogovanje extends BaseTest1 {


    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/books");
    }

    @Test
    public void UserCanLogIn() throws InterruptedException {
        bookStoreApplicationLogin.clickOnSubmitButton();
        demoquaLogovanje.getLogin();
        bookStoreApplicationLogin.inputUsername("Testeric");
        bookStoreApplicationLogin.inputPassword("Plastenik123!");
        bookStoreApplicationLogin.clickOnSubmitButton();
        Thread.sleep(1000); // sleep stavljen da bi se pronaslo log out dugme
        Assert.assertTrue(bookStoreApplicationLogin.logOutButton.isDisplayed());
    }
    @Test
    public void UserCanNotLogInWithInvalidUsername() throws InterruptedException {
        bookStoreApplicationLogin.clickOnSubmitButton();
        demoquaLogovanje.getLogin();
        bookStoreApplicationLogin.inputUsername("Marko");
        bookStoreApplicationLogin.inputPassword("Plastenik123!");
        bookStoreApplicationLogin.clickOnSubmitButton();
        Thread.sleep(1000);
        Assert.assertTrue(bookStoreApplicationLogin.invalidUsername_or_password.isDisplayed());
    }

}
