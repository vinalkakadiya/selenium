package seleniumSession;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {
    public static void main(String[] args) throws InterruptedException {
        //2.set up IEDriver (mediator) -it's path.
        System.setProperty("webdriver.ie.driver", "C:\\Users\\kakad\\IdeaProjects\\Software\\IEDriverServer.exe");


        //1.Create an instance of webdriver.
        WebDriver Driver = new InternetExplorerDriver();

        //2.set up IEDriver (mediator) -it's path.
      //  System.setProperty("webdriver.ie.driver", "C:\\Users\\kakad\\IdeaProjects\\Software\\IEDriverServer.exe");

        //3.Navigate to webpage
        Driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        Driver.manage().window().maximize();

        //4.get page title
        String title = Driver.getTitle();
        System.out.println(title);

        //5. Expected vs Actual- validation
        if (title.equals("nopcommerce demo store")) {
            System.out.println(("The title is store"));

        } else {
            System.out.println("the title is incorrect");
        }

        Driver.quit();


    }
}




