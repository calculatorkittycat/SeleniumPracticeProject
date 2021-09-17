package SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormCSS {

    public static void main(String[] args) {


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
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("lol");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("lol");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("lollolol");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("lollol@lolol.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Lmao1!45");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("123-456-7898");

        driver.findElement(By.cssSelector("input[value='male']")).click();

        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("07/05/1990");


        WebElement depDropDownElm = driver.findElement(By.cssSelector("select[name='department'"));
        Select depSelectObj = new Select(depDropDownElm);
        depSelectObj.selectByIndex(4);

        WebElement titleDropDownElm = driver.findElement(By.cssSelector("select[name='job_title'"));
        Select titleSelectObj = new Select(titleDropDownElm);
        titleSelectObj.selectByIndex(3);

        WebElement checkBox1 = driver.findElement(By.cssSelector("#inlineCheckbox1"));
        //WebElement checkBox2 = driver.findElement(By.cssSelector("#inlineCheckbox2"));
        //WebElement checkbox3 = driver.findElement(By.cssSelector("#inlineCheckbox2"));
        checkBox1.click();
        //checkBox2.click();
        //checkbox3.click();

        WebElement signUpBtn = driver.findElement(By.cssSelector("#wooden_spoon"));
        signUpBtn.click();


    }
}
