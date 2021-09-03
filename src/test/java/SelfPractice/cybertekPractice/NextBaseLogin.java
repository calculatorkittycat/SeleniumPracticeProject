package SelfPractice.cybertekPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NextBaseLogin {


    public static String browser = "Firefox";// external configuration -XLS, CSV, etc
    public static WebDriver driver; //now the driver is global//before it was only in the if statement

    public static void main(String[] args) throws InterruptedException {

        if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }


        //helpdesk5@cybertekschool.com
        //user_user

        driver.get("https://login.nextbasecrm.com/");

        driver.findElement(By.cssSelector("#login-popup > form > div:nth-child(4) > div:nth-child(1) > input")).sendKeys("helpdesk5@cybertekschool.com");
        driver.findElement(By.cssSelector("#login-popup > form > div:nth-child(4) > div:nth-child(2) > input")).sendKeys("UserUser");
        driver.findElement(By.cssSelector("#login-popup > form > div.log-popup-footer > input")).sendKeys(Keys.ENTER);

    }
}
