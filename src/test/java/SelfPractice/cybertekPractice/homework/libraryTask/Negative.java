package SelfPractice.cybertekPractice.homework.libraryTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //TODO: Given Librarian is on the Login Page
        driver.get("https://library2.cybertekschool.com/login.html");

        //TODO: Verify that the title is "Login - Library"
        System.out.println("driver.getUrl() = " + driver.getCurrentUrl());
        System.out.println("_________");

        //TODO: Enter valid librarian credentials
        driver.findElement(By.id("inputEmail")).sendKeys("seven@library");
        driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*" + Keys.TAB + Keys.ENTER);

        WebElement loginFailedMsg = driver.findElement(By.xpath("/html/body/form/div[2]/div"));
        //WebElement loginFailedMsg = driver.findElement(By.linkText("Sorry, Wrong Email or Password"));
        //WebElement loginFailedMsg = driver.findElement(By.className("alert alert-danger"));

        Thread.sleep(1000);

        if(loginFailedMsg.getText().equals("Sorry, Wrong Email or Password")){
            System.out.println("Correct message displayed: " + loginFailedMsg.getText());
        }else{
            System.out.println("Incorrect message displayed: " + loginFailedMsg.getText());
        }

    }
}
