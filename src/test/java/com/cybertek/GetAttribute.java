package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class GetAttribute {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        //get the tag of the element
        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());
        //get the value attribute of the element
        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));

        //identify and safe the search button element
        WebElement searchBtn = driver.findElement(By.name("btnk"));

        //get tag name of the element, get , class atribute
        System.out.println("searchBtn.getTagName() = " + searchBtn.getTagName());

        System.out.println("searchBtn.getAttribute(\"class\") = " + searchBtn.getAttribute("class"));

        //click on the search button
        searchBtn.sendKeys(Keys.ENTER);

        //identify the element that holds search result number
        WebElement searchResult = driver.findElement(By.id("result-stats"));

        //get the text of that element
        String resultText = searchResult.getText();

        System.out.println("resultText = " + resultText);

    }
}
