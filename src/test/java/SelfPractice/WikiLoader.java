package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiLoader {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        while (true){
            driver.navigate().to("https://en.wikipedia.org/wiki/Special:Random");
            String pageTitle = driver.getTitle();
            System.out.println("driver.getPageSource() = " + driver.getPageSource());
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
            System.out.println("pageTitle = " + pageTitle);
            Thread.sleep(5000);

        }

    }

}
