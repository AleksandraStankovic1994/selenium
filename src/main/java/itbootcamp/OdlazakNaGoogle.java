package itbootcamp;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;


public class OdlazakNaGoogle {

    @Test
    public void testGoogleSearch() throws InterruptedException {

        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        // ovu liniju koristi u svim testovima
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        //instanciramo jedan chrome driver
        WebDriver driver = new ChromeDriver();
        //ova linija otvara sajt u vrednosti
        driver.get("http://www.google.com/");
        //pauziram program za 5000 ms = 5 sekundi
        Thread.sleep(5000);
        //nalazi element sa imenom 'q'
        WebElement searchBox = driver.findElement(By.name("q"));
        //ubacuje vrednost u kutiju za pretarzivanje
        searchBox.sendKeys("ja sam selenium robot");
        //klinknemo na google search
        searchBox.submit();
        //cekamo 5 sekudni
        Thread.sleep(5000);  // Let the user actually see something!
        //zatvara web driver
        driver.quit();

    }

}
