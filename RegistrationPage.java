package seleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {


    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("vinal");
        driver.findElement(By.id("LastName")).sendKeys("kakadiya");


        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(day);
        select.selectByVisibleText("8");

        Select select1 = new Select(month);
        select1.selectByVisibleText("June");

        Select select2 = new Select(year);
        select2.selectByVisibleText("2012");

        // day.sendKeys("10");
        //  month.sendKeys("November");
        //   year.sendKeys("2015")

        driver.findElement(By.id("Email")).sendKeys("vinal.kakadiya1@tesco.com");
        driver.findElement(By.id("Company")).sendKeys("tesco");

        driver.findElement(By.id("Newsletter")).click();
        //driver.findElement(By.id("CheckBox")).click();

        driver.findElement(By.id("Password")).sendKeys("vinal123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("vinal123");

        driver.findElement(By.id("register-button")).click();

        Thread.sleep(3000);
        driver.close();
    }
}







