package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_ShoppingCart {
    public P_ShoppingCart(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-cart")
    public WebElement shopLink;
}
