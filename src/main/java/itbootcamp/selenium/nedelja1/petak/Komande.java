package itbootcamp.selenium.nedelja1.petak;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Komande {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");
       // /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea
        driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("ITBootcamp");
        driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=gsr/]")).click();

    }
}
