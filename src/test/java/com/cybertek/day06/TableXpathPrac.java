package com.cybertek.day06;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableXpathPrac extends TestBase {

    @Test
    public void testTableData(){

        driver.get("http://practice.cybertekschool.com/tables");
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']//td[text()='Jason']"));
        System.out.println("table.getText() = " + table.getText());


    }
}
