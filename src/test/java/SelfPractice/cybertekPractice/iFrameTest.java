package SelfPractice.cybertekPractice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends TestBase {

    @Test
    public void test_iFrame(){

        driver.get("http://practice.cybertekschool.com/iframe");

        //TODO: Switch to the iframe using index
        //driver.switchTo().frame(0);

        //TODO: Switch to iframe using id or name
        //driver.switchTo().frame("mce_0_ifr");

        //TODO: Switch to iframe using WebElement
        WebElement iFrameElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area' ]"));
        driver.switchTo().frame(iFrameElm);


        //TODO: Identify the p element inside the iframe
        WebElement pTagElmInsideFrame = driver.findElement(By.tagName("p"));
        System.out.println("pTagElmInsideFrame.getText() = " + pTagElmInsideFrame.getText());

        //TODO: Switch out of iframe
        //driver.switchTo().defaultContent(); // this will switch to top level html

        driver.switchTo().parentFrame();// this will switch back up one level inside nested html document

        //TODO: click on home button to go back to main practice page
        driver.findElement(By.linkText("Home")).click();

    }

    @Test
    public void test_Nested_iFrame(){

        driver.get("http://practice.cybertekschool.com/nested_frames");

        // Main Content --> top, bottom frame
        // top --> left, middle, right frame

        //TODO: Get the text out of bottom frame
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrameBodyElm = driver.findElement(By.tagName("body"));
        System.out.println("bottomFrameBodyElm.getText() = " + bottomFrameBodyElm.getText());

        //TODO: Switch out to parent frame
        //driver.switchTo().parentFrame(); // Or
        driver.switchTo().defaultContent();

        //TODO: Go to the middle frame and get the text
        //first go to top frame then go to middle frame
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameDiv = driver.findElement(By.id("content"));
        System.out.println("middleFrameDiv.getText() = " + middleFrameDiv.getText());

        //TODO: Go to the right frame and get the text
        driver.switchTo().parentFrame(); // now we are at top frame
        driver.switchTo().frame("frame-right");
        WebElement rightFrameBodyElm = driver.findElement(By.tagName("body"));
        System.out.println("rightFrameBodyElm.getText() = " + rightFrameBodyElm.getText());

        //TODO: Go back to default content
        driver.switchTo().defaultContent();



    }


}
