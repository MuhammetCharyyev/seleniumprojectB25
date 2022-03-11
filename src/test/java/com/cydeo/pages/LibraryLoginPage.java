package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //1. initialize driver instance and object of the class

    public LibraryLoginPage(){
        //initElement will create connection between the current driver session(instance)
        //and the object of current class
        PageFactory.initElements(Driver.getDriver(), this);
        // from PageFactory library// 'this' referring to this class itself
        //expression in () is saying "take 'Driver.getDriver()' and place to 'this' class"
    }

    //2. use @FindBy annotation to locate web elements
    @FindBy(xpath = "//input[@id='inputEmail']")//use @FindBy instead of findElement for Username
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")//use @FindBy instead of findElement for password
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")//use @FindBy instead of findElement for signin
    public WebElement signInButton;

//    @FindBy(xpath = "//div[@id='inputEmail-error']")
//    //use @FindBy instead of findElement for error message
//    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    //use @FindBy instead of findElement for error message
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    //use @FindBy instead of findElement for error message
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    //use @FindBy instead of findElement for error message
    public WebElement wrongEmailPasswErrorMessage;







}
