package itbootcamp.selenium.nedelja1.ponedeljak;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class testranjesajtazaknjige {
    public static void main(String[] args) {
        /*
        https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2
Testirati dodavanje knjige u korpu i da li se knjiga obrise kada obrisete kolacice
:pray:
4

driver.manage().deleteAllCookies();
driver.navigate().refresh();
         */
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
        WebElement cart= driver.findElement(By.id("nav-cart-count"));

        WebElement BOOK= driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[7]/div/div/div/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/a/div"));
        BOOK.click();
        WebElement addToCart= driver.findElement(By.name("submit.add-to-cart"));
        addToCart.click();
        WebElement CART= driver.findElement(By.id("nav-cart-count"));
        CART.click();
        Set<Cookie> skupKolacia = driver.manage().getCookies();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
       Set<Cookie> skupKolaciaPosleBrisanja = driver.manage().getCookies();
       Assert.assertNotEquals(skupKolacia, skupKolaciaPosleBrisanja, "Kolacici treba da budu obrisani");

} @Test
    public void unosKnjige(){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
        WebElement cart= driver.findElement(By.id("nav-cart-count"));

        WebElement BOOK= driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[7]/div/div/div/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/a/div"));
        BOOK.click();
        WebElement addToCart= driver.findElement(By.name("submit.add-to-cart"));
        addToCart.click();
        WebElement CART= driver.findElement(By.id("nav-cart-count"));
        CART.click();
        String expectedUrl="https://www.amazon.com/gp/cart/view.html?ref_=nav_cart";
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());

    }
    @Test
    public void testirajKolacice(){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
        WebElement cart= driver.findElement(By.id("nav-cart-count"));

        WebElement BOOK= driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[7]/div/div/div/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/a/div"));
        BOOK.click();
        WebElement addToCart= driver.findElement(By.name("submit.add-to-cart"));
        addToCart.click();
        WebElement CART= driver.findElement(By.id("nav-cart-count"));
        CART.click();
        Set<Cookie> skupKolacia = driver.manage().getCookies();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        Set<Cookie> skupKolaciaPosleBrisanja = driver.manage().getCookies();
        Assert.assertNotEquals(skupKolacia, skupKolaciaPosleBrisanja,
                "Kolacici treba da budu obrisani, nema knjige u korpi");
}
@Test
    public void BrisanjeKnjigeNakonBrisanjaKolacica() {

            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
            WebElement cart= driver.findElement(By.id("nav-cart-count"));

            WebElement BOOK= driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[7]/div/div/div/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/a/div"));
            BOOK.click();
            WebElement addToCart= driver.findElement(By.name("submit.add-to-cart"));
            addToCart.click();
            WebElement CART= driver.findElement(By.id("nav-cart-count"));
            CART.click();
            Set<Cookie> skupKolacia = driver.manage().getCookies();
            driver.manage().deleteAllCookies();
            driver.navigate().refresh();
            Set<Cookie> skupKolaciaPosleBrisanja = driver.manage().getCookies();
            Assert.assertNotEquals(skupKolacia, skupKolaciaPosleBrisanja,
                    "Brise se knjiga,ne moze se uneti ponovo knjiga");
            addToCart= driver.findElement((By.id("nav-cart-count")));
            addToCart.click();
    }
}
