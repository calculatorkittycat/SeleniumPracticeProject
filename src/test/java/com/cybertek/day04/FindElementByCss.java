package com.cybertek.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCss {

    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailBox = driver.findElement(By.cssSelector("input[type='text']"));

        emailBox.sendKeys("lol@lol.com");

        WebElement retrieve = driver.findElement(By.cssSelector("button[id='form_submit'][class='radius']"));
        retrieve.click();

        WebElement successMsg = driver.findElement(By.cssSelector("h4[name='confirmation_message']"));
        System.out.println("success.getText() = " + successMsg.getText());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

    }
}
