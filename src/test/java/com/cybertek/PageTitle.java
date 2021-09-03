package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();





        driver.get("https://cybertekschool.com");

        String pageTitle = driver.getTitle();

        System.out.println("pageTitle = " + pageTitle);

        if (pageTitle.equals("Cybertek")){
            System.out.println("Success");
        }else{
            System.out.println("FAIL");
        }

    }
}
