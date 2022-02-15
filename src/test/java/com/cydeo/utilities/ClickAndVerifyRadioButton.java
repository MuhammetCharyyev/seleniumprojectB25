package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClickAndVerifyRadioButton {

public static  void clickAndVerifyRadioButton (WebDriver driver,
             String radioGroupAttribute,String radioId ) {
    driver.findElement(By.id(radioId)).click();
    List<WebElement> radioElements = driver.findElements(By.name(radioGroupAttribute));
    for (WebElement radioElement : radioElements) {
        if (driver.findElement(By.id(radioId)).equals(radioElement)) {
            System.out.println(radioElement.isSelected());
            break;
        }
    }
}

}
/*
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)

Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */