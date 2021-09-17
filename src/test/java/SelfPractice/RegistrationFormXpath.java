package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormXpath {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/registration_form");

        /**
         * input[name='firstname']
         * input[placeholder='first name']
         * input[data-by-field='firstname']
         * input[name='firstname'][class='form-control']
         * input.form-control[name='firstname']
         */
        //TODO:Note starts-with at line 30
        driver.findElement(By.xpath("//*[starts-with(@name,'firstn')]")).sendKeys("lol");
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("lol");
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("lollolol");
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("lollol@lolol.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Lmao1!45");
        driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("123-456-7898");

        driver.findElement(By.xpath("//*[@value='male']")).click();

        driver.findElement(By.xpath("//*[@name='birthday']")).sendKeys("07/05/1990");


        WebElement depDropDownElm = driver.findElement(By.xpath("//*[@name='department']"));
        Select depSelectObj = new Select(depDropDownElm);
        depSelectObj.selectByIndex(4);

        WebElement titleDropDownElm = driver.findElement(By.xpath("//*[@name='job_title']"));
        Select titleSelectObj = new Select(titleDropDownElm);
        titleSelectObj.selectByIndex(3);

        WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='inlineCheckbox1']"));
        //WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='inlineCheckbox2'"));
        //WebElement checkbox3 = driver.findElement(By.cssSelector("#inlineCheckbox2"));
        checkBox1.click();
        //checkBox2.click();
        //checkbox3.click();
        //Thread.sleep(5000);
        WebElement signUpBtn = driver.findElement(By.xpath("//*[@id='wooden_spoon']"));
        signUpBtn.click();


    }
}
