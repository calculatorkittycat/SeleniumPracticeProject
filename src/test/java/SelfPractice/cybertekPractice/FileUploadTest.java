package SelfPractice.cybertekPractice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FileUploadTest extends TestBase {

    @Test
    public void testFileUpload(){

        driver.get("http://practice.cybertekschool.com/upload");

        String filePath = "C:\\Users\\XPS\\Desktop\\HtmlClass\\back.jpg";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        System.out.println("END");



    }

}
