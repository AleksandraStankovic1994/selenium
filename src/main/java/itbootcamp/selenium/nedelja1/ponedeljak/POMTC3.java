package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.WebDriver;

public class POMTC3 extends DomaciPOM{
    WebDriver driver;

    public POMTC3(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
