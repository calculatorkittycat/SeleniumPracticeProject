package SelfPractice.cybertekPractice.homework.libraryTask.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStatus {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        //librarian51@library
        //Sdet2022*
        //Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.id("inputEmail"));
        emailInput.sendKeys("librarian51@library");

        WebElement passInput = driver.findElement(By.id("inputPassword"));
        passInput.sendKeys("Sdet2022*");

        WebElement signInBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        signInBtn.click();
        Thread.sleep(3000);
        WebElement userBtn = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        userBtn.click();

        Thread.sleep(3000);
        WebElement status = driver.findElement(By.id("user_status"));
        status.click();

        WebElement item1 = driver.findElement(By.xpath("//option[@value='ACTIVE']"));
        WebElement item2 = driver.findElement(By.xpath("//option[@value='INACTIVE']"));

        if(item1.getText().equals("ACTIVE")){
            System.out.println("Item 1 PASS");
        }else{
            System.out.println("Item 1 FAIL");
        }

        if(item2.getText().equals("INACTIVE")){
            System.out.println("Item 2 PASS");
        }else{
            System.out.println("Item 2 FAIL");
        }

    }
}
