package com.cybertek.day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class IsDisplayedPracticeTest {

    WebDriver driver;

    @BeforeAll
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpWebDriver() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }


    @Test
    public void testErrorMsg() {
        //small[@data-bv-validator='stringLength' and @data-bv-for='firstname' ]

        driver.get("http://practice.cybertekschool.com/registration_form");
        WebElement stringLengthErrorElement = driver.findElement(By.xpath("//small[@data-bv-validator='stringLength' and @data-bv-for='firstname' ]"));

        System.out.println("stringLengthErrorElement.isDisplayed() = " + stringLengthErrorElement.isDisplayed());

        WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameField.sendKeys("a");
        System.out.println("stringLengthErrorElement.isDisplayed() = " + stringLengthErrorElement.isDisplayed());

        assertTrue(stringLengthErrorElement.isDisplayed());


    }



}