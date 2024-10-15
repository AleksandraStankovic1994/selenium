package itbootcamp.selenium.domaci.testqa;

import itbootcamp.selenium.domaci.pom.BookStoreApplicationLogin;
import itbootcamp.selenium.domaci.pom.DemoquaLogovanje;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 {protected WebDriver driver;
    protected BookStoreApplicationLogin bookStoreApplicationLogin;
    protected DemoquaLogovanje demoquaLogovanje;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        bookStoreApplicationLogin = new BookStoreApplicationLogin(driver);
        demoquaLogovanje = new DemoquaLogovanje(driver);
        driver.get("https://demoqa.com/books");
        System.out.println("OVO CES SE IZVRSITI PRE SVAKE METODE");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
