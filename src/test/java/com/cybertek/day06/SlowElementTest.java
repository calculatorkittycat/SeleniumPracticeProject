package com.cybertek.day06;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait() throws InterruptedException {

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // we can instruct web driver to wait maximum amount of time
        // before throwing no such element exception by using implicit wait
        // if element is not available it will wait a maximum amount of time
        // if element is found before that time it will move on and not
        // finish the allotted time
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove'] ")).click();

        //Thread.sleep(5000);

        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());

;

        System.out.println("THE END");
    }


}
