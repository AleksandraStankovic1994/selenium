package itbootcamp.selenium.nedelja1.petak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezba {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.Linkedin.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com/search?q=Joberty&oq=Joberty&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDUwMzFqMGo3qAIAsAIB&sourceid=chrome&ie=UTF-8");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.quit();


}}
