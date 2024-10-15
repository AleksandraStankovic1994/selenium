package itbootcamp.selenium.nedelja1.petak;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Selenium3 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        driver.navigate().to("http://www.youtube.com");
        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());
        System.out.println(" Lista tabova je" + listaTabova);
        driver.switchTo().window(listaTabova.get(1));
        driver.navigate().to("http://www.youtube.com");
        driver.navigate().to("https://www.joberty.com/sr/");
        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("http://www.Linkedin.com");
       driver.navigate().to("https://stackoverflow.com/");
       driver.close();
        driver.navigate().to(listaTabova.get(2));

    }
}
