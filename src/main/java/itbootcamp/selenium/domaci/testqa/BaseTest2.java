package itbootcamp.selenium.domaci.testqa;

import itbootcamp.selenium.domaci.pom.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest2 {
    protected WebDriver driver;
    protected PracticeFormPage practiceFormPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        practiceFormPage= new PracticeFormPage(driver);

        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("Izvrsava se pre svake metode");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
