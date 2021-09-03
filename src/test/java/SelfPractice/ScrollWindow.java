package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindow {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://en.wikipedia.org/wiki/Special:Random");



        for (int i = 0; i < 500; i+=10) {
            driver.manage().window().setPosition(new Point(i,i));
            System.out.println(driver.manage().window().getPosition());
        }

        for (int i = 500; i > 0; i-=10) {
            driver.manage().window().setPosition(new Point(i,i));
            System.out.println(driver.manage().window().getPosition());
        }




    }
}
