package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Maximize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();
        //go to Google
        driver.get("https://google.com");
        //maximize the window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //close
        driver.close();
    }
}
