package SelfPractice.cybertekPractice.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceXpathTask {

    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://saucedemo.com");

        //TODO: Locate user name input box by xpath
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("standard_user");

        //TODO: Locate password input box by xpath
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");

        //TODO: Identify login button by xpath
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        //TODO: Identify each element by xpath
        WebElement firstItem = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        System.out.println("firstItem.getText() = " + firstItem.getText());

        WebElement secondItem = driver.findElement(By.xpath("//a[@id='item_0_title_link']//div[contains(text(),'Bike')]"));
        System.out.println("secondItem.getText() = " + secondItem.getText());

        WebElement thirdItem = driver.findElement(By.xpath("//a[@id='item_1_title_link']//div[contains(text(),'Bolt')]"));
        System.out.println("thirdItem.getText() = " + thirdItem.getText());

        WebElement fourthItem = driver.findElement(By.xpath("//a[@id='item_5_title_link']//div[contains(text(),'Fleece')]"));
        System.out.println("fourthItem.getText() = " + fourthItem.getText());

        WebElement fifthItem = driver.findElement(By.xpath("//div[contains(text(),'Onesie')]"));
        System.out.println("fifthItem.getText() = " + fifthItem.getText());

        WebElement sixthItem = driver.findElement(By.xpath("//div[contains(text(),'Test.all')]"));
        System.out.println("sixthItem.getText() = " + sixthItem.getText());

        //TODO: Identify drop down items

        WebElement dropDown1 = driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='az']"));
        dropDown1.click();

        WebElement dropDown2 = driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='za']"));
        dropDown2.click();

        WebElement dropDown3 = driver.findElement(By.xpath("//select[@class='product_sort_container']//option[@value='lohi']"));
        dropDown3.click();

        //Shorter Xpath
        WebElement dropDown4 = driver.findElement(By.xpath("//option[@value='hilo']"));
        dropDown4.click();

        //TODO: Click on add to cart using Xpath

        WebElement addToCart = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        WebElement addToCart2 = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']"));
        addToCart2.click();

        //TODO: Click on shopping cart using Xpath
        WebElement clickCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        clickCart.click();

        WebElement shopCart = driver.findElement(By.xpath("//button[@id='checkout']"));
        shopCart.click();

        //TODO: Fill in text boxes with Xpath
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Navi");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Niac");

        WebElement zip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zip.sendKeys("98177");

        //TODO: Click continue by using Xpath
        WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
        continueBtn.click();

        //TODO: Click finish by using Xpath
        WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
        finish.click();

        //TODO: Verify with Xpath
        WebElement done = driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU F')]"));

        if(done.getText().equals("THANK YOU FOR YOUR ORDER")){
            System.out.println("Pass, Order submitted");
        }else{
            System.out.println("Fail");
        }


        driver.quit();











    }
}
