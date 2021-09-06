package SelfPractice.cybertekPractice.homework.libraryTask.userStory2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddBook {

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

        Thread.sleep(3000);

        driver.findElement(By.linkText("Books")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Add Book")).click();
        Thread.sleep(3000);
        //BookName, ISBN, Year, Author, and Description
        driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div/div/div/div/form/div[1]/div/div[1]/div[1]/div/input")).sendKeys("Muhtar: A life well lived");
        driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div/div/div/div/form/div[1]/div/div[1]/div[2]/div/input")).sendKeys("32165497");
        driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div/div/div/div/form/div[1]/div/div[1]/div[3]/div/input")).sendKeys("2020");
        driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div/div/div/div/form/div[1]/div/div[2]/div[1]/div/input")).sendKeys("Akbar n' friends");
        driver.findElement(By.xpath("/html/body/main/section[3]/div[2]/div/div/div/div/form/div[1]/div/div[3]/div/div/textarea")).sendKeys("Muhtar: A life well lived is " +
                "a humble book with humble beginnings. If you like Game of Thrones, you'll LOVE Muhtar: A life well lived",Keys.TAB,Keys.TAB,Keys.ENTER);



    }
}
