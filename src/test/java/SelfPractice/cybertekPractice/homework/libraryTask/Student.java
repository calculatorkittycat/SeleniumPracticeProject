package SelfPractice.cybertekPractice.homework.libraryTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Student {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //TODO: Given Librarian is on the Login Page
        driver.get("https://library2.cybertekschool.com/login.html");

        //TODO: Verify that the title is "Login - Library"
        System.out.println("driver.getUrl() = " + driver.getCurrentUrl());
        System.out.println("_________");

        //TODO: Enter valid librarian credentials
        driver.findElement(By.id("inputEmail")).sendKeys("student38@library");
        driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*" + Keys.TAB + Keys.ENTER);

        //List<WebElement> allEl =driver.findElements(By.linkText("Dashboard"));
        Thread.sleep(2000);
        //TODO: Then verify that there are 2 modules on page
        List<WebElement> all = driver.findElements(By.className("title"));


        if (all.size() == 2) {
            System.out.println("There are 2 modules on the page");
        } else {
            System.out.println("FAIL");
        }

        driver.quit();

    }
}
