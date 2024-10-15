package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Saucdemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        Domaci
Testirati bar 3 razlicita test case-a za logovanje na sledecem linku:
https://www.saucedemo.com
         */

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement saucedemobutton = driver.findElement(By.className("login_wrapper"));
        saucedemobutton.click();
        WebElement usernameField= driver.findElement(By.id("user-name"));
        usernameField.click();
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.click();
        WebElement logInButton= driver.findElement(By.id("login-button"));
        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        String loginPageURL = driver.getCurrentUrl();
        usernameField.clear();
        usernameField.sendKeys(validUsername);

        passwordField.clear();
        passwordField.sendKeys(validPassword);
        logInButton.click();
        //String invalidUsername="Marko";
        //String validPassword="secret_sauce";
        loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        //usernameField.sendKeys(invalidUsername);

        //passwordField.clear();
       //passwordField.sendKeys(validPassword);
        //logInButton.click();
        //String validUsername="standard_user";
        //String invalidPassword="kraljevstvo";
        loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        //loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        //usernameField.sendKeys(validUsername);

        //passwordField.clear();
        //passwordField.sendKeys(invalidPassword);
        //logInButton.click();
        //String logInButtonurl;

        String expectedURL = "/https://www.saucedemo.com/inventory.html";


        //String expectedURL1="https://www.saucedemo.com/";
        //Assert.assertEquals(driver.getCurrentUrl(), expectedURL1);
        Thread.sleep(3000);
        WebElement menu= driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        Thread.sleep(1000);

       WebElement logOutButton = driver.findElement(By.id("logout_sidebar_link"));
        logOutButton.click();
        String expectedUrl="https://www.saucedemo.com/";
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());


    }
    @org.testng.annotations.Test
    public void proveralogovanja() throws InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement saucedemobutton = driver.findElement(By.className("login_wrapper"));
        saucedemobutton.click();
        WebElement usernameField= driver.findElement(By.id("user-name"));
        usernameField.click();
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.click();
        WebElement logInButton= driver.findElement(By.id("login-button"));
        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        String loginPageURL = driver.getCurrentUrl();
        usernameField.clear();
        usernameField.sendKeys(validUsername);

        passwordField.clear();
        passwordField.sendKeys(validPassword);
        logInButton.click();
        //String invalidUsername="Marko";
        //String validPassword="secret_sauce";
        loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        //usernameField.sendKeys(invalidUsername);

        //passwordField.clear();
        //passwordField.sendKeys(validPassword);
        //logInButton.click();
        //String validUsername="standard_user";
        //String invalidPassword="kraljevstvo";
        loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        //loginPageURL = driver.getCurrentUrl();
        //usernameField.clear();
        //usernameField.sendKeys(validUsername);

        //passwordField.clear();
        //passwordField.sendKeys(invalidPassword);
        //logInButton.click();
        //String logInButtonurl;

        String expectedURL = "/https://www.saucedemo.com/inventory.html";


        //String expectedURL1="https://www.saucedemo.com/";
        //Assert.assertEquals(driver.getCurrentUrl(), expectedURL1);
        Thread.sleep(3000);
        WebElement menu= driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        Thread.sleep(1000);

        WebElement logOutButton = driver.findElement(By.id("logout_sidebar_link"));
        logOutButton.click();
        String expectedUrl="https://www.saucedemo.com/";
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());

    }


}
