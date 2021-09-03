package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        //1. Setup chrome driver so selenium can use it to automate chrome
        WebDriverManager.chromedriver().setup();
        //2. Create chrome driver object to open browser
        WebDriver driver = new ChromeDriver();
        //3. navigate to https://google.com
        driver.navigate().to("https://www.majorgeeks.com/");




    }


}
