package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().setSize(new Dimension(640,480));

        Thread.sleep(3000);

        driver.findElement(By.id("box2")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("box1")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("box2")).click();





    }


}
