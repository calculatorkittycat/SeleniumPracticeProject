package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioButton {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");


        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());
        blueRadio.click();

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());

        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        //any element can use isEnabled() method to check if the element is enabled

        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        WebElement yellowRadio = driver.findElement(By.id("yellow"));
        System.out.println("yellowRadio.isSelected() = " + yellowRadio.isSelected());
        System.out.println("yellowRadio.isEnabled() = " + yellowRadio.isEnabled());

        List<WebElement> allColorRadios = driver.findElements(By.name("color"));

        allColorRadios.get(2).click();

        //loop over all the elements to print these id attributes, isSelected, isEnabled
        System.out.println("allColorRadios.size() = " + allColorRadios.size());
        for (WebElement each : allColorRadios) {
            System.out.println("_____________");
            System.out.println("each.getAttribute(\"id\") = " + each.getAttribute("id"));
            System.out.println("each.isSelected() = " + each.isSelected());
            System.out.println("each.isEnabled() = " + each.isEnabled());
            System.out.println("_____________");
        }


        driver.quit();
    }


}
