package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NopCommerce {

    public NopCommerce(){
        PageFactory.initElements(Hooks.driver,this);

    }
    @FindBy(xpath ="//a[@href=\"https://www.nopcommerce.com/\"]")
    public WebElement facebook;

    @FindBy(xpath = "//a[@href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twitter;



    @FindBy(xpath = "//a[@href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement youtube;


}



