package com.cydeo.tests.officeHours.practice_03_16_2022;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class VyTrack_US12 {

    @DataProvider(name="filters")//just give name and any "string"
    //using DataProvider annotation because not every company has Cucumber
    public Object[][] dpMethod(){ //always use Object and 2dimensional array object
//return type only, not void
        List<String> expectedFilters =
                Arrays.asList("Account Name","Contact Name","Contact Email","Contact Phone",
                "Owner","Business Unit","Created At","Updated At");
        //collect all module names in one list, as shown on web page

        Object[][] objData = new Object[1][1];//memorize and use this
        objData[0][0]= expectedFilters;

        return objData;
    }



    @Test(dataProvider = "filters")
    //@Test tag has also DataProvider name because we're gonna use above obj in our test
    public void account_page_costumer_info(List<String> expectedFilters){
        VytrackUtils.loginAsStoreManager();
        VytrackUtils.waitTillLoaderMaskDisappear();

        //VytrackUtils.navigateToModule("Customers","Accounts");

        WebElement customers= Driver.getDriver().findElement
                (By.xpath("(//li[@class='dropdown dropdown-level-1'])[2]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(customers).perform();
        Driver.getDriver().findElement(By.xpath("//span[.='Accounts']")).click();

        Driver.getDriver().findElement(By.xpath("//a[@title='Filters']")).click();

        List<WebElement> filters = Driver.getDriver().findElements
                (By.xpath("//div[@class='filter-item oro-drop']"));

        for (int i = 0; i < expectedFilters.size(); i++) {
            //iterate each element of expectedFilters list as above stated
            System.out.println(filters.get(i).getText());
            //printing text of each element of filter
            String[] filter= filters.get(i).getText().split(":");
            //get text till ':'
            String actualFilter = filter[0].toString();
            //filter with 0 index
            assertEquals(actualFilter,expectedFilters.get(i));
  //verify if each filter name corresponds with name of expectedFilters list as above stated
        }

    }
}
