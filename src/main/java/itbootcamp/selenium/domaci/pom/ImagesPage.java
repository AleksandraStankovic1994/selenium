package itbootcamp.selenium.domaci.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImagesPage {

    public WebElement elementalSelenium;
    private WebDriver webDriver;
    private final String BROKEN_iMAGES__URL = "https://the-internet.herokuapp.com/broken_images";

    public ImagesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getNaslov() {
        return webDriver.findElement(By.tagName("h3"));
    }

    public void navigate() {
        webDriver.navigate().to(BROKEN_iMAGES__URL);
    }
    public WebElement elementalSelenium (){
        return webDriver.findElement(By.linkText("Elemental Selenium"));
    }
}
