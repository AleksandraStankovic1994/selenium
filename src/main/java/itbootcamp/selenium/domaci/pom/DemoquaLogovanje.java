package itbootcamp.selenium.domaci.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoquaLogovanje {
    //Domaci:
    //Otici na https://demoqa.com/ sajt, zatim na elements->text box
    // i testirati popunjavanje forme sa validnim, nevalidnim mail-om
    // i
    // proveriti da li je output ispravan za svako polje
    private WebDriver driver;
    private final String Book_Store_Application= "https://demoqa.com/books";
    public DemoquaLogovanje(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(By.tagName("h1"));
    }
    public void navigate() {
        driver.navigate().to(Book_Store_Application);
    }

}

