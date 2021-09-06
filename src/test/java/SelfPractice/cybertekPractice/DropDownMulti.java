package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMulti {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        //TODO: Identify the dropdown with multi-select option
        WebElement multiItemDropDown = driver.findElement(By.name("Languages"));

        //TODO: Wrap this element into select object
        Select multiItemSelect = new Select(multiItemDropDown);

        //TODO: check if this element has multi-select option
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());

        //TODO: Check if this is a multi-select list
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        multiItemSelect.deselectAll();





    }
}
