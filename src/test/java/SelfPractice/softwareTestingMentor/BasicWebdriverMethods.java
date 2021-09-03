package SelfPractice.softwareTestingMentor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class BasicWebdriverMethods {

    public static String browser = "Chrome";// external configuration -XLS, CSV, etc
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

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title = driver.getTitle();
        System.out.println(title);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
        System.out.println(webElements);

        //windowHandle print current window handle

        driver.navigate().to("https://www.freecodecamp.org/news/how-to-use-html-to-open-link-in-new-tab/");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);//print window handle

        //Window handles are unique to each window that is in this driver instance
        //so when you run this below code you will get the window handle for both tabs that have been opened

        //windowHandles prints all currently opened tabs window handles

        driver.findElement(By.xpath("//*[@id=\"site-main\"]/div/article/section/div[1]/p[23]/a")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        driver.quit();







    }





}
