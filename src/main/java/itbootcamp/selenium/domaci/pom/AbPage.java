package itbootcamp.selenium.domaci.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbPage {

    private WebDriver webDriver;
    private final String AB_PAGE_URL = "https://the-internet.herokuapp.com/abtest";

    public AbPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getNaslov() {
        return webDriver.findElement(By.tagName("h1"));
    }
    public void navigate() {
        webDriver.navigate().to(AB_PAGE_URL);
    }
}
