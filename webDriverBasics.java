package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class webDriverBasics {

    public static void main(String[] args) throws InterruptedException {
        //2.set up firefox driver(mediator) -it's path.

        System.setProperty("webdriver.opera.driver", "C:\\Users\\kakad\\IdeaProjects\\Software\\operadriver.exe");

        //1.Create an instance of driver.
        WebDriver driver = new OperaDriver();


        //3.Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //4.get page title(Tab name)
        String title = driver.getTitle();
        System.out.println(title);

        //5. Expected vs Actual- validation
        if (title.equals("nopcommerce demo store")) {
            System.out.println("The title is store");
        } else {
            System.out.println("the title is incorrect");
        }
        driver.quit();


    }
}


