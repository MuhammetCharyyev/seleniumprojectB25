package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_GetText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //getting from method we created in Utility package
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//3- Verify “Reset password” button text is as expected:
//Expected: Reset password

        //syntax-> tagName[attribute='value']
        // input[class='login-btn']
        //using cssSelector
        //cssSelector allows you to find exactly what we want without indication attributes
       // button[value='Reset password']);
        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetText = "Reset password";
        String actualResetText = resetPassword.getAttribute("value");
        //signInButton.getAttribute ->because "Reset password" text is inside the attribute 'value'
        //or we can simply getText "Reset password" which is inside the <button> tag->
        // ->String actualResetText = resetPassword.getText();

        System.out.println("actualResetText = " + actualResetText);
        //printed out -> actualButtonText = Log In

        if(actualResetText.equals(expectedResetText)){
            System.out.println("reset verification passed");
        }else{
            System.out.println("rest verification failed");
        }
    }


}
/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password
 */