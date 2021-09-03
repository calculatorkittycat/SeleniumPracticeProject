package SelfPractice.softwareTestingMentor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TEST {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //TODO: 1. navigate to https://google.com
        driver.get("https://www.google.com/");

        //TODO: 2. search for `selenium`
        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("Selenium");

        //TODO: 3. click google search button
        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys(Keys.ENTER);

        //TODO: 4. identify the div that hold the search result count on next page
        WebElement result = driver.findElement(By.id("result-stats"));

        //TODO: 5. get the text of that element
        String resultStats = result.getText();
        System.out.println("resultStats = " + resultStats);
        System.out.println("____________________________");

        //TODO: Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLY


        //TODO: 7. get all the link that contain text `selenium` into a List<WebElement>
        driver.findElement(By.linkText("Selenium"));




        driver.quit();

    }
}



