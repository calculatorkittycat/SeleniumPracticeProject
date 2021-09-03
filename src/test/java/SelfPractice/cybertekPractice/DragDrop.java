package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com/drag_and_drop");
        driver.findElement(By.cssSelector("#details-button")).click();
        driver.findElement(By.cssSelector("#proceed-link")).click();

        WebElement fromElement = driver.findElement(By.id("column-a"));
        WebElement toElement = driver.findElement(By.id("column-b"));
        //Creating object of Actions class to build composite actions
        Actions builder = new Actions(driver);

//Building a drag and drop action
       // Action dragAndDrop = builder.clickAndHold(fromElement)
               /// .moveToElement(toElement)
            //    .release(toElement)
             //   .build();

//Performing the drag and drop action
       // dragAndDrop.perform();



    }

}
