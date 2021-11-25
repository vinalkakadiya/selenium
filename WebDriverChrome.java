package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {
        public static void main(String[] args)throws InterruptedException {
            //2.set up firefox driver(mediator) -it's path.
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakad\\IdeaProjects\\Software\\chromedriver.exe");


            //1.Create an instance of webdriver.
            WebDriver Driver = new ChromeDriver();

            //2.set up firefox driver(mediator) -it's path.
            //  System.setProperty("webdriver.gecko.driver", "C:\\Users\\kakad\\IdeaProjects\\Software\\geckodriver.exe");

            //3.Navigate to webpage
            Driver.get("https://demo.nopcommerce.com/");
            Thread.sleep(5000);
            Driver.manage().window().maximize();

            //4.get page title(Tab name)
            String title = Driver.getTitle();
            System.out.println(title);

            //5. Expected vs Actual- validation
            if (title.equals("nopcommerce demo store")) {
                System.out.println(("The title is store"));

            }  else{
                System.out.println("the title is incorrect");
            }

            Driver.quit();


        }
    }


