package toolset;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;


import java.time.Duration;

import static toolset.WebDriverTool.driver;

public class Actions {

    private Actions() {
        throw new IllegalStateException("Utility class");
    }

    public static void verifyElement(String elementID) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementID)));
    }

    public static void fillField(String elementID, String text) {
        driver.findElement(By.cssSelector(elementID)).sendKeys(text);
    }

    public static void clickField(String elementID) {
        driver.findElement(By.cssSelector(elementID)).click();
    }

    public static void pressEnter(String elementID) {
        driver.findElement(By.cssSelector(elementID)).sendKeys(Keys.ENTER);
    }

    public static void verifyResults(String wordToFind) {
        String pageSource = driver.getPageSource();

        try {
            assert pageSource != null;
            Assertions.assertTrue(pageSource.contains(wordToFind),"The word should not be present in the page source.");
        } catch (Exception e) {
        throw new RuntimeException("Page is not displayed correctly.", e);
        }
    }
}