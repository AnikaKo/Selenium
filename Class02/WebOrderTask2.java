package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();
        /*navigate to
        login
        get title and verify
        logout
        close the browser
         */

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize
        driver.manage().window().maximize();
        //send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //send the pasword
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click on the log button
        driver.findElement(By.className("button")).click();
        //title, verify
      String title=driver.getTitle();

      if(title.equalsIgnoreCase("Web Orders")){
          System.out.println("The title is correct");
      }else{
          System.out.println("The title is incorrect");}

          //        logout
       //   driver.findElement(By.linkText("Logout")).click();

//        close the browser
       //   driver.quit();

      }

    }

