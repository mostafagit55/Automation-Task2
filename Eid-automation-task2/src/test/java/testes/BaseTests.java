package testes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DateCalculatorPage;

public class BaseTests {
     public WebDriver driver;
     protected DateCalculatorPage dateCalculatorPage;

     @BeforeMethod
     public void setUp(){
          driver= new ChromeDriver();
          driver.get("https://www.bestcase.com/date-calculator/");
          driver.manage().window().maximize();
          //JavascriptExecutor js = (JavascriptExecutor) driver;
          //js.executeScript("scrollBy(0,600)");
          dateCalculatorPage = new DateCalculatorPage(driver);

     }





}
