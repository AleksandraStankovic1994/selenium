package itbootcamp.selenium.nedelja1.ponedeljak;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zADATAK7 {
    /*
    / Zadatak 7
// Ulogovati se na wordpress aplikaciju koristeci sopstvene kredencijale
// Fokus treba da bude na cekanjima i lokatorima
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/");
        WebElement LogIn= driver.findElement(By.linkText("Log in"));
         LogIn.click();
         WebElement emailnameAdressUsername= driver.findElement(By.name("usernameOrEmail"));
         emailnameAdressUsername.click();
         emailnameAdressUsername.sendKeys("sandra.trnavcevic@gmail.com");
         WebElement kcontinue=driver.findElement(By.cssSelector("#primary > div > main > div.wp-login__container > div > form > div.card.login__form > div.login__form-action > button"));
         Thread.sleep(5000);
         kcontinue.click();
         WebElement passwordfield= driver.findElement(By.id("password"));
         Thread.sleep(3000);
         passwordfield.click();
         Thread.sleep(3000);
         passwordfield.sendKeys("plastenik1401994");
         kcontinue.click();
         // U slucaju kada imamo cekanje da se URL promeni, ovo moze takodje biti deo testa
        // i asertacija linka moze biti suvisna
        // jer ako se URL ne promeni na ovaj zadati, onda ce test pasti na tom koraku
        //wait.until(ExpectedConditions.urlToBe("https://wordpress.com/home/dragoljubqa.wordpress.com"));
        // Ali mozemo dodati posebno asertacije kako bismo kasnije lakse proverili gde sve imamo asertacije i sta sve proveravamo
        String expectedURL = "https://wordpress.com/home/dhttps://893.b551ee.wordpress.com";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        // S obzirom da nakon logovanja trazim da li je username prisutan na elementu, dobijam string koji ne sadrzi samo username
        WebElement profileName = driver.findElement(By.className("masterbar__item-howdy-howdy"));
        String profileNameText = profileName.getText();
        // Zato mogu da biram da li cu da napravim boolean koji ce proveriti da li to polje sadrzim username koriscen za logovanje
        boolean containsUsername = profileNameText.contains((CharSequence) emailnameAdressUsername);

        Assert.assertTrue(containsUsername);
        // Ili da upisem taj dodatni deo stringa u proveru
        Assert.assertEquals(profileNameText, "Howdy, " + emailnameAdressUsername);




    }
}
