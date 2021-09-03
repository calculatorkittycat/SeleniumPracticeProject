package SelfPractice.softwareTestingMentor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static org.openqa.selenium.support.locators.RelativeLocator.with;
//used for maven 4.0 relative locators



public class Locators {



    public static String browser = "Chrome";// external configuration -XLS, CSV, etc
    public static WebDriver driver; //now the driver is global//before it was only in the if statement

    public static void main(String[] args) throws InterruptedException {

        if(browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if(browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }


        //driver.get("https://www.saucedemo.com/");

        //STANDARD LOCATORS
        //driver.findElement(By.id("user-name")).sendKeys("Testing");//By.id
        //driver.findElement(By.className("form_input")).sendKeys("Testing");//By.className//finds first match
        //driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");//By.cssSelector
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Testing");//By.xPath
        //driver.findElement(By.tagName("input")).sendKeys("Testing");//By.tagName


        driver.get("https://en.wikipedia.org/wiki/Spam_(food)");
        String pagetitle = driver.getTitle();
        System.out.println("page title = " + pagetitle);

        //driver.findElement(By.linkText("Hormel Foods Corporation")).click();//identify element by link text
        driver.findElement(By.partialLinkText("Hormel F")).click();//identify element by partial link text
        //driver.findElement(By.name()) Identifies element by name


        //driver.get("https://www.saucedemo.com/");

        //***COULD NOT GET TO WORK***
        //RELATIVE LOCATORS
        //USES MAVEN 4.0 BETA //must add dependencies to pom.xml
        //first import
        //"import static org.openqa.selenium.support.locators.RelativeLocator.with;"

        //Find Above Element//Use when above element has no usable identifiers but below element does
        //WebElement password = driver.findElement(By.id("password"));//now password variable contains "password" web element
        //driver.findElements(withTagName("input").above(password)).sendKeys("Testing");









    }
}
