package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public DynamicLoad1Page(){
        //initElement will create connection between the current driver session(instance)
        //and the object of current class
        PageFactory.initElements(Driver.getDriver(), this);
        // from PageFactory library// 'this' referring to this class itself
        //expression in () is saying "take 'Driver.getDriver()' and place to 'this' class"
    }

    @FindBy (xpath = "//button[.='Start']")//locate 'start' button
    public WebElement startButton;

    @FindBy(css = "div#loading")//locating 'loading' function
    public WebElement loadingBar;

    @FindBy(css = "#username")//locating 'username' field
    public WebElement inputUsername;

    @FindBy(css = "#pwd")//locating 'password' field
    public WebElement inputPassword;

    @FindBy (xpath = "//button[.='Sumbit']")//locate 'submit' button
    public WebElement submitButton;

    @FindBy(id = "flash")//locating 'error' message
    public WebElement errorMessage;

}
