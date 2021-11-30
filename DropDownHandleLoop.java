package seleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandleLoop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
//for day list
        Select select = new Select(day);
        List<WebElement> daysList = select.getOptions();


        for (int i = 0; i < daysList.size(); i++) {
            String value = daysList.get(i).getText();

            System.out.println(value);
        }
        

        //for month list


        Select select1 = new Select(month);
        List<WebElement> monthList = select1.getOptions();
        System.out.println(monthList.size());

        for (int m = 0; m < monthList.size(); m++) {
            String value1 = monthList.get(m).getText();
            System.out.println(value1);


        }
        //for year list

        Select select2 = new Select(year);
        List<WebElement> yearlist = select2.getOptions();
        System.out.println(yearlist.size());

        for (int y = 0; y < yearlist.size(); y++) {
            String value2 = yearlist.get(y).getText();
            System.out.println(value2);


        }
    }
}






