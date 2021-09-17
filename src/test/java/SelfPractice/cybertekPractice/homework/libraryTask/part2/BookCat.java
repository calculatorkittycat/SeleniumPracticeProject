package SelfPractice.cybertekPractice.homework.libraryTask.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookCat {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(2000,0));
        driver.get("https://library2.cybertekschool.com/login.html");
        //librarian51@library
        //Sdet2022*
        //Thread.sleep(1000);
        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("librarian51@library");
        userNames.add("librarian52@library");
        userNames.add("student38@library");
        userNames.add("student39@library");
        userNames.add("student40@library");

        for(String each : userNames) {


            WebElement emailInput = driver.findElement(By.id("inputEmail"));
            emailInput.sendKeys(each);

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

            List<WebElement> all = driver.findElements(By.id("book_categories"));

            //System.out.println(all.size()-7);


            Select selectObj = new Select(dropDownElm);
            System.out.println("Username = " + each);
            System.out.println("Book Category List Size = " + selectObj.getOptions().size());

        /*
        int size;
        for (int i = 1; i < 20; i++) {
            selectObj.selectByIndex(i);
            System.out.println("selectObj.getAllSelectedOptions().size() = " + selectObj.getAllSelectedOptions().size());

        }
         */


            Thread.sleep(1000);
            driver.findElement(By.id("navbarDropdown")).click();
            driver.findElement(By.linkText("Log Out")).click();

        }





        }
    }


