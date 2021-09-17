package com.cybertek.day06;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPracticeTest extends TestBase {

    @Test
    public void testJavaScriptAlert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");


        WebElement jsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlert.click();
        //alert methods
        //-accept()
        //dismiss()
        //sendKey(yourText)
        //getText()
        driver.switchTo().alert().accept();// this will click on the accept button

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        driver.switchTo().alert().dismiss();// this will click on dismiss button

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();;

        System.out.println("the end");









    }


}
