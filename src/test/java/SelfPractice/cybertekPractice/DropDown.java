package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        //TODO: Identify the select element
        WebElement dropDownElm = driver.findElement(By.id("dropdown"));

        //TODO: Wrap this element inside select object
        Select selectObj = new Select(dropDownElm);

        //TODO: Use ready methods to select options
        selectObj.selectByIndex(2); //selects 3rd, or index 2
        selectObj.selectByValue("1"); //select item with value attribute 1
        selectObj.selectByVisibleText("Option 2");


        //TODO: Quit the browser
        driver.quit();

    }
}
