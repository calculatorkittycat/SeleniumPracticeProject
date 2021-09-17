package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByXpathYahoo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://search.yahoo.com/");


        //TODO: use xpath to identify searchbox and enter "xpath"
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='yschsp']"));
        searchBox.sendKeys("xpath");

        Thread.sleep(1000);

        //TODO: click on x icon to clear out the text
        WebElement xIcon = driver.findElement(By.xpath("//button[@id='sbq-clear']//span[@class='sprite']"));
        xIcon.click();

        //TODO: enter "selenium locators" into searchbox
        searchBox.sendKeys("selenium locators");

        //TODO: identify search icon and click on it
        WebElement searchIcon = driver.findElement(By.xpath("//span[@title='Search']"));
        searchIcon.click();


    }
}
