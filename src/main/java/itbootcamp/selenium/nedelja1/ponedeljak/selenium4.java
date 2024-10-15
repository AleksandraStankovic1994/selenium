package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selenium4 {


    public class Zadatak6 {
        public static void main(String[] args) throws InterruptedException {


            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.navigate().to("https://practicetestautomation.com/");

            WebElement practiceButton = driver.findElement(By.id("menu-item-20"));
            practiceButton.click();

            WebElement testLoginPageButton = driver.findElement(By.linkText("Test Login Page"));
            testLoginPageButton.click();

            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement submitButton = driver.findElement(By.id("submit"));
            String loginPageURL = driver.getCurrentUrl();

            String invalidUsername = "non student";
            String validPassword = "Password123";

            usernameField.clear();
            usernameField.sendKeys(invalidUsername);
            passwordField.clear();
            passwordField.sendKeys(validPassword);
            submitButton.click();

            Thread.sleep(2000);

            WebElement error = driver.findElement(By.id("error"));
            String errorMessage = error.getText();

            Assert.assertEquals(errorMessage, "Your username is invalid!");

            Assert.assertEquals(driver.getCurrentUrl(), loginPageURL);
}}}
