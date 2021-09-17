package SelfPractice.cybertekPractice.homework.libraryTask.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logout {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        //librarian51@library
        //Sdet2022*
        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.id("inputEmail"));
        emailInput.sendKeys("librarian51@library");

        WebElement passInput = driver.findElement(By.id("inputPassword"));
        passInput.sendKeys("Sdet2022*");

        WebElement signInBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        signInBtn.click();
        Thread.sleep(3000);

        WebElement dropDown = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
        dropDown.click();

        WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
        logout.click();

        if(driver.getTitle().equals("Login - Library")){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }



    }

    }

