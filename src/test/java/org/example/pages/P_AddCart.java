package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P_AddCart {
    public P_AddCart(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(xpath = "//button[@class=\"button-2 product-box-add-to-cart-button\"]")
    public List<WebElement> elementList;

    @FindBy(id = "add-to-cart-button-4")
    public WebElement add;


    @FindBys({
            @FindBy(how = How.ID,using = "bar-notification")
    })
    public List<WebElement> notification;
}
