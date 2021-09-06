package SelfPractice.cybertekPractice.homework.libraryTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Librarian {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //TODO: Given Librarian is on the Login Page
        driver.get("https://library2.cybertekschool.com/login.html");

        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("librarian51@library");
        userNames.add("librarian52@library");


        //TODO: Verify that the title is "Login - Library"
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("_________");

        for (String each : userNames) {


            //TODO: Enter valid librarian credentials
            driver.findElement(By.id("inputEmail")).sendKeys(each);
            Thread.sleep(2000);
            driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*" + Keys.TAB + Keys.ENTER);

            //List<WebElement> allEl =driver.findElements(By.linkText("Dashboard"));
            Thread.sleep(5000);
            //TODO: Then verify that there are 3 modules on page
            List<WebElement> all = driver.findElements(By.className("title"));


            if (all.size() == 3) {
                System.out.println("There are 3 modules on the page");
            } else {
                System.out.println("FAIL");
            }


            driver.findElement(By.id("navbarDropdown")).click();
            driver.findElement(By.linkText("Log Out")).click();





        }

        driver.quit();





    }
}
