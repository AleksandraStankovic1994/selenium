package itbootcamp.selenium.nedelja1.petak;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class vezba2 {
    public static void main(String[] args) {
        /*
        /Zadatak 2
//Otvoriti browser i jos 5 tabova
//Na svakom tabu otvoriti URL po zelji
//Zatvoriti sve tabove osim onog gde je otvoren Google
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 5; i++) {
            js.executeScript("window.open()");
        }

        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(listaTabova.get(1));
        driver.navigate().to("https://www.youtube.com");

        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("https://www.joberty.rs");

        driver.switchTo().window(listaTabova.get(3));
        driver.navigate().to("https://www.linkedin.com");

        driver.switchTo().window(listaTabova.get(4));
        driver.navigate().to("https://www.stackoverflow.com");

        driver.switchTo().window(listaTabova.get(5));
        driver.navigate().to("https://www.google.com");

        for (int i = 0; i < listaTabova.size(); i++) {
            driver.switchTo().window(listaTabova.get(i));
            System.out.println("Link je: " + driver.getCurrentUrl());
            if (!driver.getCurrentUrl().equals("https://www.google.com/")) {
                driver.close();
            }
        }

    }
}

