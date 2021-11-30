package seleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPagePath {

    public static void main(String[] args) throws InterruptedException {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.findElement(By.className("ico-register")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@value='M']")).click();
            driver.findElement(By.xpath("//input[@value='F']")).click();
            driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("vinal");
            driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("kakadiya");


            WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
            WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
            WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));

            Select select = new Select(day);
            select.selectByVisibleText("8");

            Select select1 = new Select(month);
            select1.selectByVisibleText("June");

            Select select2 = new Select(year);
            select2.selectByVisibleText("2012");



            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vinal.kakadiya@tesco.com");
            driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("tesco");

            driver.findElement(By.xpath("//input [@id='Newsletter']")).click();
            //driver.findElement(By.id("CheckBox")).click();

            driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("vinal123");
            driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("vinal123");

            driver.findElement(By.xpath("//button[@name='register-button']")).click();

            Thread.sleep(3000);
            driver.close();
        }
    }


