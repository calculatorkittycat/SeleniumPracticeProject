package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/autocomplete");

        Thread.sleep(1500);

        //driver.findElement(By.id("myCountry")).click();

        WebElement inputBox = driver.findElement(By.id("myCountry"));
        inputBox.sendKeys("u");




        Thread.sleep(300);
        inputBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        inputBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        inputBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        inputBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(300);
        inputBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        inputBox.sendKeys(Keys.ENTER);
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/input")).click();

        /*
        inputBox.sendKeys(Keys.TAB);
        Thread.sleep(500);
        inputBox.sendKeys(Keys.ENTER);
         */






    }
}
