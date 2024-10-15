package itbootcamp.selenium.domaci.DomaciYoutube;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class DomaciYoutube {
//    private final static String XPATH_BAJAGA = "/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-image/img";
    private final static String XPATH_BAJAGA = "//*[@id=\"thumbnail\"]/yt-image/img";

    //Otvoriti youtube i pustiti pesmu po zelji
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        ArrayList<String> listaTabova= new ArrayList<>();
        driver.navigate().to("http://www.google.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https://www.youtube.com/results?search_query=bajaga+tisina");
        driver.findElement(By.xpath(XPATH_BAJAGA)).click();
        Thread.sleep(5000);
}}
