package class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class CapturePageSource {

        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.navigate().refresh();
            String pageSource= driver.getPageSource();
            System.out.println(pageSource);
        }
}
