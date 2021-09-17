package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByCssSelector {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://search.yahoo.com/");

        //TODO: Identify search box by CSS SELECTOR
        //TODO: <input type="text" class="sbq" id="yschsp" name="p"
        //WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        //WebElement searchBox = driver.findElement(By.cssSelector("input[name='p']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='p'][type='text"));


        searchBox.sendKeys("lol");


    }
}
