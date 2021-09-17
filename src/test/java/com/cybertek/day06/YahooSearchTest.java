package com.cybertek.day06;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.jupiter.api.Assertions.*;

import java.security.Key;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomePage(){
        driver.get("https://search.yahoo.com") ;
        String expectedTitle = "Yahoo Search - Web Search" ;
        String actualTitle = driver.getTitle();
    }

    @Test
    public void testYahooSearchResultPage(){

        driver.get("https://search.yahoo.com");
        driver.findElement(By.name("p")).sendKeys("Selenium" + Keys.ENTER);

        assertTrue( driver.getTitle().startsWith("Selenium"));

    }
}


