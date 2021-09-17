package com.cybertek.day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;



public class LoginFormPracticeTest {

    ////h2[text()='Login Page']

    WebDriver driver;

    @BeforeEach
    public void setUpWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(2000,0));
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }




    @Test
    public void testLogin(){

        driver.get("http://practice.cybertekschool.com/login");

        //h2[ .='Login Page' ]
        WebElement header = driver.findElement(By.xpath("//h2[ .='Login Page' ]"));
        System.out.println("header.getText() = " + header.getText());

        //   css selector :   input[name='username']
        // @Hande Tek Karsi
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        //   css selector :   input[name='password']
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword");

        // wooden_spoon
        driver.findElement(By.id("wooden_spoon")).click();

        //div[@id='flash']
        WebElement successMsg = driver.findElement(By.xpath(" //div[@id='flash']"));

        String expectedResult = "You logged into a secure area!" ;
        //assertEquals(expectedResult , successMsg.getText() );
        assertTrue(successMsg.getText().startsWith("You logged into a secure area!"));

        //div[contains(text(),'You')]

        System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());

        String xpathStr = "//div[contains(text(),'You')]";
        WebElement successMsg2 = driver.findElement(By.xpath(xpathStr));

        assertTrue(successMsg2.isDisplayed());

        WebElement firstNameMust = driver.findElement(By.xpath("//small[@data-bv-validator='stringLength' and @data-bv-for='firstname' ]"));

        assertFalse(firstNameMust.isDisplayed());
    }
}