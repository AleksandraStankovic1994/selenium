package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleleniumcookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/");
        Cookie COOKIE= new Cookie("wordpress_logged_in", "automatic893b55b1ee%7C1822583801%7Co2csVUojTtBlwKlje4lr9KvfLMeLTy2Sf0aTs3QGubr%7Cd6e0d6c833279b545686c48f92427372e7f2f57e2b52e65ea897a181c605fa5f");
        driver.manage().addCookie((COOKIE));
        driver.navigate().refresh();


    }
}
