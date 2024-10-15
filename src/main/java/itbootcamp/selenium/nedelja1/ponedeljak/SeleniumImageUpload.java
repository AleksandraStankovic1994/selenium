package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumImageUpload {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://imgflip.com/memegenerator");
       //
       /*
      WebElement uploadThePicture= driver.findElement(By.id("mm-show-upload"));
        uploadThePicture.click();
       WebElement uploadTheImage= driver.findElement(By.xpath("mm-upload-file-btn"));
       Thread.sleep(1000);
       uploadTheImage.click();
       WebElement inputImage=driver.findElement(By.id("mm-show-upload"));
       String imageLocation= "C:\\Users\\Konstantin-Pc\\Desktop\\JPG File.(jpg)";
       inputImage.sendKeys(imageLocation);
*/

    }

}
