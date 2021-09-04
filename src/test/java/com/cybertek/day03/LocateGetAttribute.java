package com.cybertek.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateGetAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");

        driver.findElement(By.cssSelector("#details-button")).click();
        driver.findElement(By.cssSelector("#proceed-link")).click();


        //get the first link on the page and get the href attribute
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));

        //get text practice
        System.out.println("firstLink.getText() = " + firstLink.getText());

        //get any attribute of identified element, in this case href

        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));

        //navigate to google.com and identify the search box and get couple attributes value
        driver.get("https://google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        //get the class attribute

        //maxlength

        //title

        //autocapitalize

        //spellcheck
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));
        System.out.println("searchBox.getAttribute(\"maxlength\") = " + searchBox.getAttribute("maxlength"));
        System.out.println("searchBox.getAttribute(\"title\") = " + searchBox.getAttribute("title"));
        System.out.println("searchBox.getAttribute(\"title\") = " + searchBox.getAttribute("title"));
        System.out.println("searchBox.getAttribute(\"autocapitalize\") = " + searchBox.getAttribute("autocapitalize"));
        System.out.println("searchBox.getAttribute(\"spellcheck\") = " + searchBox.getAttribute("spellcheck"));

        //using value attribute of input text box to extract the text inside

        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));


        driver.quit();


    }
}
