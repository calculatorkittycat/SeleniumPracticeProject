package SelfPractice.cybertekPractice.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zero {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //TODO: 1. open chrome and navigate to http://zero.webappsecurity.com/
        driver.get("http://zero.webappsecurity.com/");

        //TODO: 2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Checking Title Match...");

        if(driver.getTitle().equals("Zero - Personal Banking - Loans - Credit Cards")) {
            System.out.println("DONE! : MATCHING TITLE");
        }else{
            System.out.println("DONE! : NON MATCHING TITLE");
        }

        //TODO: 3. click on `sign in button`

        driver.findElement(By.id("signin_button")).click();

        //TODO: 4. verify the title is "Zero- Log in"

        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Checking Title Match...");

        if(driver.getTitle().equals("Zero- Log in")) {
            System.out.println("DONE! : MATCHING TITLE");
        }else{
            System.out.println("DONE! : NON MATCHING TITLE");
        }

        //TODO: 5. enter text as "username" into username box

        driver.findElement(By.id("user_login")).sendKeys("username");

        //TODO: 6. enter text "password" into password box

        driver.findElement(By.id("user_password")).sendKeys("password");

        //TODO: 7. submit by clicking login button

        driver.findElement(By.name("submit")).click();

        //TODO: 8. verify you are at "Zero - Account Summary" page by checking title
        driver.findElement(By.cssSelector("#details-button")).click();
        driver.findElement(By.cssSelector("#proceed-link")).click();

        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Checking Title Match...");

        if(driver.getTitle().equals("Zero - Account Summary")) {
            System.out.println("DONE! : MATCHING TITLE");
        }else{
            System.out.println("DONE! : NON MATCHING TITLE");
        }

        Thread.sleep(5000);


        driver.quit();

    }
}
