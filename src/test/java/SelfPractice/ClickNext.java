package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ClickNext {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://youtu.be/P22F17cYWng");


        //driver.get("https://en.wikipedia.org/wiki/Spam_(food)"); //wiki


        Thread.sleep(2000);


        //driver.manage().window().maximize();
        //x118y617

        Actions act = new Actions(driver);
                act.moveByOffset(107,319).click().build().perform();




        //driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[26]/div[2]/div[1]/a[2]")).click();

        //driver.findElement(By.linkText("Help")).click(); //wiki


    }



}
