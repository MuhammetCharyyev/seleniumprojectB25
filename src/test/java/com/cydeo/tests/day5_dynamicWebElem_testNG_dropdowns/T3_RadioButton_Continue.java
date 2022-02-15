package com.cydeo.tests.day5_dynamicWebElem_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_Continue {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //getting from method we created in Utility package
        driver.manage().window().maximize();

        //providing extra wait time before it throws NoSuchElement Exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2- Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
       // WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        //Locate name='sports' radio buttons and store them in a List of Web Element

        clickAndVerifyRadioButton(driver, "sport", "hockey" );

        clickAndVerifyRadioButton(driver, "sport", "football");

        clickAndVerifyRadioButton(driver, "color", "yellow");


//        List<WebElement> sportRadioBtns = driver.findElements(By.name("sport"));
//
//       for(WebElement each : sportRadioBtns) {//loop for all sport radio btns
//
//           String eachId = each.getAttribute("id");
//
//           System.out.println("eachId = " + eachId);//printing all sport buttons/list
//
//           if (eachId.equals("hockey")) {
//               each.click();//when button is 'hockey', click it
//               System.out.println("Hockey is selected: "+ each.isSelected());
//               break;//after clicking the loop is finished
//
//           }



    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {

                each.click();
                System.out.println(eachId + " is selected : " + each.isSelected());
                break;
            }
        }
    }

}
