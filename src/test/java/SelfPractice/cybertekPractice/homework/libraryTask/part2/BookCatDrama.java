package SelfPractice.cybertekPractice.homework.libraryTask.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookCatDrama {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(2000,0));
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
        WebElement userBtn = driver.findElement(By.xpath("//span[contains(text(),'Books')]"));
        userBtn.click();

        Thread.sleep(3000);
        WebElement dropDownElm = driver.findElement(By.id("book_categories"));
        dropDownElm.click();

        //List<WebElement> all = driver.findElements(By.id("book_categories"));

        Select selectObj = new Select(dropDownElm);
        selectObj.selectByIndex(6);

        WebElement drama = driver.findElement(By.xpath("//select/option[@value='6']"));
        System.out.println("drama.isSelected() = " + drama.isSelected());

    }


}
