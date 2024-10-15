package itbootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObrazacZaTestove {

    @Test
    public void testNesto() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        //instanciramo jedan chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
    }
}
