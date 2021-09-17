package SelfPractice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class YouTubePageDown extends TestBase {

    @Test
    public void Test() throws InterruptedException {
        driver.get("https://www.youtube.com/playlist?list=FLZ4HiveSCBlDEO7J9UWZk3A");

        Thread.sleep(2000);
        WebElement page =driver.findElement(By.className("style-scope ytd-masthead"));
        for (int i = 0; i < 100; i++) {
            page.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(1000);
        }

    }
}
