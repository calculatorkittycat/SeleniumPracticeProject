package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();





            driver.get("https://en.wikipedia.org/wiki/Special:Random");

            Thread.sleep(2000);

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.manage().window().fullscreen();

            Thread.sleep(2000);

            driver.manage().window().setPosition(new Point(100,200));
            System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());

            Thread.sleep(2000);

            driver.navigate().refresh();

            Thread.sleep(2000);

            driver.manage().window().setSize(new Dimension(640,480));

            Thread.sleep(2000);

            driver.close();

            System.out.println("Completed!");

        }





    }

//driver.get(url)
//same but shorter way than - driver.navigate().to(url)