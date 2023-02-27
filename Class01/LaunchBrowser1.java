package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser1 {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located

        //for mac users do not use .exe with chrome driver

        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_mac64/chromedriver");

        //create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        // open the Website facebook.com
        driver.get("https://www.facebook.com");

        // get the current url that is there in the browser
        String URL=driver.getCurrentUrl();
        System.out.println(URL);


        //get the title of the webpage
        String title=driver.getTitle();
        System.out.println("the title of the page is "+title);

//slow down for 3sec
        Thread.sleep(3000);


        //close the driver
        driver.close();

    }
}