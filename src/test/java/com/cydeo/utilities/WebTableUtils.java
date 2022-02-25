package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
//* • Name: returnOrderDate ()
// * • Return type: String
// * • Arg1: WebDriver driver
// * • Arg2: String costumerName

    public static String returnOrderDate(WebDriver driver, String customerName) {


        WebElement customerDateCell = driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]"));
        //to make it reusable put the 'customerName'

        return customerDateCell.getText();
    }


    public static void orderVerify (WebDriver driver, String customerName, String expectedOrderDate ) {

        WebElement customerDateCell = driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]"));

        String actualOrderDate = customerDateCell.getText();//get order date from the cell

        Assert.assertEquals(actualOrderDate, expectedOrderDate);
        //compare actual and expected entry by customer
    }


}
/**
 * TC #2: Web table practice Task1 cont.
 * 1. Create a new class called WebTableUtils.
 * 2. Create two methods to verify order

 * Method #1 info:
 * • Name: returnOrderDate ()
 * • Return type: String
 * • Arg1: WebDriver driver
 * • Arg2: String costumerName
 * This method should accept a costumerName and return the costumer order date
 * as a String.
 * <p>
 * <p>
 * Method #2 info:
 * • Name: orderVerify ()
 * • Return type: void
 * • Arg1: WebDriver driver
 * • Arg2: String costumerName
 * • Arg3: String expectedOrderDate
 * This method should accept above mentioned arguments and internally assert
 * expectedOrderDate matching actualOrderDate.
 */