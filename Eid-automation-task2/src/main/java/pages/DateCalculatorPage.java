package pages;

import Utilities.CommonHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DateCalculatorPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By dateTextInput = By.id("txtStartDate");
    private By pickerSwitchDays = By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']");
    private By pickerSwitchMonths = By.cssSelector("div[class='datepicker-months'] th[class='datepicker-switch']");
    private By pickerSwitchyears = By.cssSelector("div[class='datepicker-years'] th[class='datepicker-switch']");
    private By tableDays = By.cssSelector("tbody[xpath='1']");
    private By tableMonths = By.cssSelector("tbody[xpath='2']");
    private By tableYears = By.cssSelector("div[class='datepicker-years'] table[class='table-condensed']");
    private By nextYears = By.cssSelector("div[class='datepicker-years'] th[class='next']");
    private By desiredFutureYear = By.xpath("//span[text()='2036']");
    private By desiredFutureMonth = By.xpath("//span[text()='Dec']");
    private By desiredFutureday = By.xpath("//td[text()='20']");

    public DateCalculatorPage(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickDateInputField(){
        CommonHelpers.Scroll(driver,dateTextInput);
        //wait.until(ExpectedConditions.elementToBeClickable(dateTextInput));
        CommonHelpers.findWebElement(driver,dateTextInput).click(); // example for findWebElement method called from helper class
    }
    public String getSelectedDate(){
        return driver.findElement(dateTextInput).getText();
    }
    public void clickPickerSwitchToMoveToMonths(){
        driver.findElement(pickerSwitchDays).click();
    }

    public void clickPickerSwitchToMoveToYears(){
        driver.findElement(pickerSwitchMonths).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tableYears));
    }

    public void selectYear() {
        WebElement yearsTable = driver.findElement(tableYears);
        List<WebElement> tableYearsRows = yearsTable.findElements(By.tagName("span"));
        for (WebElement year : tableYearsRows) {
            System.out.println(year.getText());
        }
    }

    public void clickNextYearsBtn(){
        driver.findElement(nextYears).click();
    }

    public void selectFutureYear(){
        driver.findElement(desiredFutureYear).click();
    }

    public void selectFutureMonth(){
        driver.findElement(desiredFutureMonth).click();
    }
    public void selectFutureDay(){
        driver.findElement(desiredFutureday).click();
    }
}


