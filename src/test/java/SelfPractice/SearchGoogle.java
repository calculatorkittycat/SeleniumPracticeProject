package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchGoogle {

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
        List<WebElement> allSelenium = driver.findElements(By.partialLinkText("Selenium"));

        //TODO: 8. get the count
        System.out.println("Size of allSelenium list : " + allSelenium.size());
        System.out.println("____________________________");

        //TODO: 9. get the first one text
        System.out.println("First Link");
        WebElement firstItem = allSelenium.get(0);
        System.out.println("firstItem = " + firstItem.getText());

        //TODO: 10. get the last one text
        System.out.println("Last Link");
        WebElement lastItem = allSelenium.get(10);
        System.out.println("lastItem = " + lastItem.getText());


        //TODO: 11. iterate over the list and print the text of each link
        System.out.println("All Links");
        for (WebElement webElement : allSelenium) {
            System.out.println("webElement = " + webElement.getText());
        }

        //TODO: 12. watch the short to learn more about `findElement(By.tagName("tag here"))`

        //TODO: 13. watch the short to learn more about `element.getAttribute("attribute goes here")`

        driver.quit();




    }

}
