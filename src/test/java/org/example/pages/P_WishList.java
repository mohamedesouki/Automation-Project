package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_WishList {

    public P_WishList(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-wishlist")
    public WebElement wishLink;
}
