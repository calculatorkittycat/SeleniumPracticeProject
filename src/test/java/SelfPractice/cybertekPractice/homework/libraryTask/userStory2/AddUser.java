package SelfPractice.cybertekPractice.homework.libraryTask.userStory2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUser {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //TODO: Given Librarian is on the Login Page
        driver.get("https://library2.cybertekschool.com/login.html");

        //TODO: Verify that the title is "Login - Library"
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("_________");

        //TODO: Enter valid librarian credentials
        driver.findElement(By.id("inputEmail")).sendKeys("librarian51@library");
        driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*" + Keys.TAB + Keys.ENTER);

        Thread.sleep(4000);

        driver.findElement(By.linkText("Users")).click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Add User")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div/div/div/div/form/div[1]/div/div[1]/div/div/input")).sendKeys("lol hai");
        driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div/div/div/div/form/div[1]/div/div[2]/div[1]/div/input")).sendKeys("wtf123!!");
        driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div/div/div/div/form/div[1]/div/div[2]/div[2]/div/input")).sendKeys("hithere@gmail.com");
        driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div/div/div/div/form/div[1]/div/div[5]/div/div/textarea")).sendKeys("1234 5th street sw");
        driver.findElement(By.xpath("/html/body/main/section[2]/div[2]/div/div/div/div/form/div[1]/div/div[5]/div/div/textarea")).sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);

        //WebElement email = driver.findElement(By.name("hithere@gmail.com"));

        //if ( email.equals("hithere@gmail.com")){
           // System.out.println("Account created");
       // }else {
          //  System.out.println("Fail");
      //  }



    }
}