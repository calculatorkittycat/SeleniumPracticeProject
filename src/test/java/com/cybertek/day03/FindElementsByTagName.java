package com.cybertek.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsByTagName {

    public static void main(String[] args) {

        /*
        purple tag name
        orange attribute name
        blue attribute value
        black text
         */

        //open chrome and navigate to practice site
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        //identify first element with tag name a
        //driver.findElement(By.cssSelector("#details-button")).click();
        //driver.findElement(By.cssSelector("#proceed-link")).click();

        WebElement firstLnk = driver.findElement(By.tagName("a"));
        System.out.println("firstLnk.getText() = " + firstLnk.getText());

        //what if I wanted to find and store all elements with <a> tag --> findElements

        List <WebElement> allATagElements =driver.findElements(By.tagName("a"));
        System.out.println("allATagElements.size() = " + allATagElements.size());

        //allTagElements.ITER// give a name to each element
        for (WebElement eachElement : allATagElements) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
            System.out.println("eachElement.getAttribute(\"href\") = " + eachElement.getAttribute("href"));
        }

        WebElement firstH1TagElm = driver.findElement(By.tagName("h1"));
        System.out.println("firstH1TagElm = " + firstH1TagElm.getText());



        driver.quit();


    }
}
