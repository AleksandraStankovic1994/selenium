package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoqua {

    private WebDriver driver;
    /*
    Koristeci anotacije,
    ulogujte se na demoqa (https://demoqa.com/ -> Book Store Application) preko cookies-a
     */

    @Test
    public void testLoginCookies() {
        Cookie cookie= new Cookie("userName", "mama");
//        Cookie cookie2= new Cookie("password","Password123@");
        Cookie cookie3= new Cookie("token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Im1hbWEiLCJwYXNzd29yZCI6IlBhc3N3b3JkMTIzQCIsImlhdCI6MTcyODE5OTQ2OX0.n3tYByG72Hn3_6erMe6Rjrnehn41dGL8A_NmGNUFpZ4");
        Cookie cookie4= new Cookie("userID","4c86fdce-ee62-441d-9592-e1fb7f27a122");
            Cookie cookie5= new Cookie("expires","2024-12-13T08%3A15%3A12.518Z");

        driver.manage().addCookie((cookie));
//        driver.manage().addCookie((cookie2));
        driver.manage().addCookie((cookie3));
        driver.manage().addCookie((cookie4));
        driver.manage().addCookie((cookie5));
        driver.navigate().refresh();
        System.out.println();
        driver.navigate().to("https://demoqa.com/books");
        WebElement username= driver.findElement(By.id("userName-value"));
        Assert.assertEquals(username.getText(), "mama");
        //token: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Im1hbWEiLCJwYXNzd29yZCI6IlBhc3N3b3JkMTIzQCIsImlhdCI6MTcyODE5OTQ2OX0.n3tYByG72Hn3_6erMe6Rjrnehn41dGL8A_NmGNUFpZ4
        //userName: mama
        //passworod: Password123@
        //userID 4c86fdce-ee62-441d-9592-e1fb7f27a122
        //driver.manage().addCookie();
        //driver.navigate().refresh();


    }
    @BeforeMethod
    public  void setUp (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }
}
