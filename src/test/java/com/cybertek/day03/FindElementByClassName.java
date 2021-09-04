package com.cybertek.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByClassName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        WebElement elm1 = driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());

        WebElement firstListItem = driver.findElement(By.className("list-group-item"));
        System.out.println("firstListItem = " + firstListItem.getText());

        List<WebElement> allListItems = driver.findElements(By.className("list-group-item"));

        System.out.println("allListItems.size() = " + allListItems.size());

        for (WebElement eachListItem : allListItems) {
            System.out.println(eachListItem.getText());
        }

        driver.quit();

    }
}
