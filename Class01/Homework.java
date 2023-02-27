package Class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Homework {
    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com");
        String title= driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        driver.quit();






    }



}
