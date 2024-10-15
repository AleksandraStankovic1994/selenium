package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class q {
    public void main(String[] args) {
       /*
       // Zadatak 5
// Testirati log in stranice https://practicetestautomation.com/
        */
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com/");
        driver.navigate().to("https://practicetestautomation.com/");
        driver.findElement(By.xpath("/html/body/ntp-app//div/div[2]/cr-searchbox//div/input"));
        driver.findElement(By.id("id=\"input\""));
        driver.getWindowHandles();



}}
