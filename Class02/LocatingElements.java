package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //send it the username
        driver.findElement(By.id("email")).sendKeys("Anika");
        driver.findElement(By.name("pass")).sendKeys("anika.01081989");
        //click on the button create new acc
       // driver.findElement(By.linkText("Create new account")).click();

        //click on forgotton pass
        driver.findElement(By.partialLinkText("password?")).click();
        driver.quit();
    }
}
