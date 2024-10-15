package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestObrazacPagePom extends DomaciPOM{
    WebDriver driver;
    WebElement nesto;

    public TestObrazacPagePom(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getNesto() {
        return driver.findElement(By.id("nesto-id"));
    }

}
