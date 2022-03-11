package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {

    //1.create constructor and instantiate driver and object of class

    public DynamicLoad7Page(){
        //initElement will create connection between the current driver session(instance)
        //and the object of current class
        PageFactory.initElements(Driver.getDriver(), this);
        // from PageFactory library// 'this' referring to this class itself
        //expression in () is saying "take 'Driver.getDriver()' and place to 'this' class"
    }

    @FindBy(xpath = "//strong[.='Done!']")//locate message "done" on page
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@alt='square pants']")//locate image
    public WebElement spongeBobImage;


}
