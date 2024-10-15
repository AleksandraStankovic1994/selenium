package itbootcamp.selenium.domaci.testqa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmailValidInvalid extends BaseTest {

    @Test
    public void testValidEmail() {
        textBoxPage.insertFullName("Tester Testeric");
        textBoxPage.sendValidEmail();
        textBoxPage.fillCurrentAddress("adresa 1");
        textBoxPage.fillPermanenttAddress("adresa 2");
        textBoxPage.clickSubmitButton();

        String submittedEmail = textBoxPage.submittedEmail();
        Assert.assertTrue(submittedEmail.contains(TextBoxPage.VALID_EMAIL),
                "E-mail should be present in response");
    }

    @Test
    public void testInvalidEmail() {
        textBoxPage.insertFullName("Tester Testeric");
        textBoxPage.sendInvalidEmail();
        textBoxPage.fillCurrentAddress("adresa 1");
        textBoxPage.fillPermanenttAddress("adresa 2");
        textBoxPage.clickSubmitButton();
        String classes = textBoxPage.getCssClassesForInputEmail();
        Assert.assertTrue(classes.contains(TextBoxPage.FIELD_ERROR_CLASS),
                "classes should contain UI css class");
    }
}
