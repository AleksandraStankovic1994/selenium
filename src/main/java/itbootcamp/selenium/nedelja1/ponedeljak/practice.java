package itbootcamp.selenium.nedelja1.ponedeljak;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class practice {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com/");
        driver.navigate().to("https://practicetestautomation.com/");
          driver.findElement(By.className("<div id=\"menu-primary-container\" class=\"menu-primary-container\">\n" +
                "\t\t\t\t\t\t\t\t<div id=\"menu-primary\" class=\"menu-container menu-primary\" role=\"navigation\">\n" +
                "    <nav class=\"menu\"><ul id=\"menu-primary-items\" class=\"menu-primary-items\"><li id=\"menu-item-43\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-23 current_page_item menu-item-43\"><a href=\"https://practicetestautomation.com/\" aria-current=\"page\">Home</a></li>\n" +
                "<li id=\"menu-item-20\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-20\"><a href=\"https://practicetestautomation.com/practice/\">Practice</a></li>\n" +
                "<li id=\"menu-item-21\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-21\"><a href=\"https://practicetestautomation.com/courses/\">Courses</a></li>\n" +
                "<li id=\"menu-item-19\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-19\"><a href=\"https://practicetestautomation.com/blog/\">Blog</a></li>\n" +
                "<li id=\"menu-item-18\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-18\"><a href=\"https://practicetestautomation.com/contact/\">Contact</a></li>\n" +
                "</ul></nav></div>\n" +
                "\t\t\t\t\t\t\t</div>")).sendKeys(Keys.ENTER);


        driver.findElement(By.className("class=\"home page-template-default page page-id-23 wp-custom-logo full-post\"")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("<a href=\"https://practicetestautomation.com/practice-test-login/\">Test Login Page</a>")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("<a href=\"https://practicetestautomation.com/practice/\">Practice</a>")).sendKeys(Keys.ENTER);


    }
}
