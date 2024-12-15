package toolset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTool {

    public static final WebDriver driver = new ChromeDriver();

    public static void setDriver() {
        driver.get("https://www.selenium.dev/documentation/");
    }
    public static void closeDriver() {
        driver.quit();
    }
}
