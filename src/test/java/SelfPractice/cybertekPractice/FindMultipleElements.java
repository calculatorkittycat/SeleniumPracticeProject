package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        List<WebElement> allLink = driver.findElements(By.partialLinkText("A"));
        System.out.println("allLink.size() = " + allLink.size());
        System.out.println("allLink = " + allLink);

        for (int i = 0; i < 7; i++) {
            WebElement firstItem = allLink.get(i);
            System.out.println("firstItem.getText() = " + firstItem.getText());
        }


        driver.quit();
    }
}
