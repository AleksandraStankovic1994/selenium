package itbootcamp.selenium.domaci.testqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected TextBoxPage textBoxPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        textBoxPage = new TextBoxPage(driver);
        driver.get("https://demoqa.com/text-box");
        System.out.println("OVO CES SE IZVRSITI PRE SVAKE METODE");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
