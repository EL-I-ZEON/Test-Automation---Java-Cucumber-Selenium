package automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtils {

    public static WebDriver initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        return new ChromeDriver();
    }
}