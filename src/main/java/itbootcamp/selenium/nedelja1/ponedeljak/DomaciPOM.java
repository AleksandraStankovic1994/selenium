package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DomaciPOM {

    private TestObrazacPagePom test;
    /*
    Na sledecem sajtu izabrati 3 case-a koja cete uraditi, tako sto cete koirstiti POM
https://the-internet.herokuapp.com/
     */
    WebDriver driver;

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/");
       // WebElement aBTesting= driver.findElement(By.linkText("A/B Testing"));
        //aBTesting.click();
        //WebElement addRemove= driver.findElement(By.linkText("Add/Remove Elements"));
        //addRemove.click();
        WebElement basicAuth= driver.findElement(By.linkText("Basic Auth"));
        basicAuth.click();
    }

    @Test
    public void test() {
        test.getNesto();
    }

}
