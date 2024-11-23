package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DateCalculatorTests extends BaseTests{

    @Test
    public void pickFutureDate(){

        //open date selector
        dateCalculatorPage.clickDateInputField();
        dateCalculatorPage.clickPickerSwitchToMoveToMonths();
        dateCalculatorPage.clickPickerSwitchToMoveToYears();
        //select year
        dateCalculatorPage.clickNextYearsBtn();
        dateCalculatorPage.selectFutureYear();
        dateCalculatorPage.selectFutureMonth();
        dateCalculatorPage.selectFutureDay();
        Assert.assertEquals(dateCalculatorPage.getSelectedDate(), "12/20/2036");

        //select month
        //select day
    }

}
