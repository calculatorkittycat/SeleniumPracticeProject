package SelfPractice.cybertekPractice.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SauceLabs {

    public static void main(String[] args) throws InterruptedException {

        //TODO: Setup ChromeDriver and Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //TODO: Navigate to https://saucedemo.com
        driver.get("https://saucedemo.com");

        //TODO: Make the window maximized
        driver.manage().window().maximize();

        //TODO: Print out the page title
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //TODO: Enter user name
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //TODO: Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //TODO: Click log-in button
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //TODO: Get the name and price of the first product
        WebElement firstItem = driver.findElement(By.className("inventory_item_name"));
        System.out.println("first.getText() = " + firstItem.getText());

        //TODO: Get the ID of first product
        WebElement firstProductLnk = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLnk.getAttribute(\"id\") = " + firstProductLnk.getAttribute("id"));

        WebElement firstPrice = driver.findElement(By.className("inventory_item_price"));
        System.out.println("firstPrice.getText() = " + firstPrice.getText());

        //TODO: Get all product names into List<WebElement>

        List<WebElement> allItems = driver.findElements(By.className("inventory_item_name"));

        //TODO: Get the count
        System.out.println("allItems.size() = " + allItems.size());

        //TODO: Print out the text of all products
        for (WebElement allItem : allItems) {
            System.out.println("Price and Info : " + allItem.getText());

        }

        //TODO: Print out the text of all products
        List<WebElement> allText = driver.findElements(By.className("inventory_item_desc"));
        for (WebElement allTexts : allText) {
            System.out.println("allTexts.getText() = " + allTexts.getText());
        }

        //TODO: Click on the shopping cart link in the top right corner
        WebElement cartContainerElm = driver.findElement(By.className("shopping_cart_link"));
        cartContainerElm.click();

        //TODO: Click on continue to shop button to come back to product page
        driver.findElement(By.id("continue-shopping")).click();

        driver.quit();











    }
}
