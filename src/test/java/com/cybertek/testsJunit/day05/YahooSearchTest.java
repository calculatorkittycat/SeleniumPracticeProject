package com.cybertek.testsJunit.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchTest {

    WebDriver driver;

@BeforeAll
public static void setUpDriver(){
    WebDriverManager.chromedriver().setup();
}
@BeforeEach
public  void setUpWebDriver(){
    driver = new ChromeDriver();
}
@AfterEach
public void closeBrowser(){
    driver.quit();
}
@AfterAll
public static void afterAll(){
    System.out.println("After All");
}


    @Test
    public void testYahoo(){
        driver.get("https://search.yahoo.com/");
        String actualTitle = "Yahoo Search - Web Search";
        assertEquals("Yahoo Search - Web Search", actualTitle);

    }
    /*
    @Test
    public void testSearch(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://search.yahoo.com/");
        WebElement searchBox = driver.findElement(By.id("yschsp"));
        searchBox.sendKeys("Selenium"+Keys.ENTER);

        String actualResult = driver.getTitle();
        assertTrue(actualResult.startsWith("Sel"));

    }
     */

}
