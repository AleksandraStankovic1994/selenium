package itbootcamp.selenium.domaci.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownPage {

    private WebDriver webDriver;
    private final String DROPDOWN_PAGE_URL = "https://the-internet.herokuapp.com/dropdown";

    public DropdownPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

  public WebElement getNaslov() {
       return webDriver.findElement(By.tagName("h3"));
   }

    public void clickOnDropdown() {
        WebElement dropdownELement= webDriver.findElement(By.id("dropdown-ID"));
        dropdownELement.click();
    }

    public void navigate() {
        webDriver.navigate().to(DROPDOWN_PAGE_URL);
    }
}
