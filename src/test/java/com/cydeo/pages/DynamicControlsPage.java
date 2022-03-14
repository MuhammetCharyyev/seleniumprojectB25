package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "form#checkbox-example>button")//way find by css, remove button
    public WebElement removeBtn;

    @FindBy (css = "div#loading")
    public WebElement loadingBar;//location of loading box

    @FindBy (css = "input[type='checkbox']")
    public WebElement checkbox;//location of checkbox

    @FindBy (css="p[id='message']")
    public WebElement goneMess; //location of 'it's gone' message


}
