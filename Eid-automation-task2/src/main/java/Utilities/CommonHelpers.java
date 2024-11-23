package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonHelpers {
    // helper method that can be called within the pages classes methods to sumerize this "driver.find element().
    // Also you can use it here with some helper class methods.
    public static WebElement findWebElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }
    // this method is to Scroll to the desired element
    public static void Scroll(WebDriver driver, By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", findWebElement(driver, locator));
    }


}

