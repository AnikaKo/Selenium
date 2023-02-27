package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_mac64/chromedriver");
        //initiate the instance of Webdriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2000);
        // now wavigate to facebook.com
        driver.navigate().to("https://facebook.com/");
        //go back
        driver.navigate().back();

        Thread.sleep(2000);
        //go to fb
        driver.navigate().forward();
        Thread.sleep(3000);
        //refresh the page
        driver.navigate().refresh();
        driver.close();
    }
}
