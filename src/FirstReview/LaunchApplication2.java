package FirstReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication2 {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

       WebDriver driver=new ChromeDriver();
     /*   ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");*/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.close();

    }
}
