package com.cydeo.tests.day2_locators_getYext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize the window

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

//3- Verify header text is as expected://  Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        //searching By tag name, found through 'Inspect' the <h2/h2>...
        String expectedHeadText = "Registration form";

        String actualHeadText = headerText.getText();
        //assign because we need to get return as a String "Registration form"

        if (actualHeadText.equals(expectedHeadText)) {
            System.out.println("header text verification passed");
        } else {
            System.out.println("header text verification failed");
        }

        //4- Locate “First name” input box

        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        //here we are locating the web element
        //name attribute has name value
        //searching By name, found through 'Inspect' input type="" id="" name="firstname"...

       //5- Verify placeholder attribute’s value is as expected: //  Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
        //placeholder is what is written in the box

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("placeholder text verification passed");
        }else {
            System.out.println("placeholder text verification failed");
        }

    }


}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
 */