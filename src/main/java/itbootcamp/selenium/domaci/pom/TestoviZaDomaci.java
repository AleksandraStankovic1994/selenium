package itbootcamp.selenium.domaci.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestoviZaDomaci {

    private AbPage abPage;
    private DropdownPage dropdownPage;
    private ImagesPage imagesPage;
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        abPage = new AbPage(driver); //konstrukciju objekta
        dropdownPage = new DropdownPage(driver);
        imagesPage = new ImagesPage(driver);
    }

    @Test
    public void testAbPage() {
        abPage.navigate();
        WebElement naslov = abPage.getNaslov();
    }
    @Test
    public void testDropDown() {
        dropdownPage.navigate();
        WebElement naslov = dropdownPage.getNaslov();
} @Test
    public void testImagePage() {
        imagesPage.navigate();
        WebElement naslov = imagesPage.getNaslov();
    }
    @Test
    public void testImagePage1() {
        imagesPage.navigate();
        WebElement element= imagesPage.elementalSelenium();
    }
}
