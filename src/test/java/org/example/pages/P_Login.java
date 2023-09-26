package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_Login {

    public P_Login(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(linkText = "/login?returnUrl=%2Fproducttag%2Fall")
    public WebElement loginLink;

    @FindBy(name = "Email")
    public WebElement email;

    @FindBy(name ="Password")
    public WebElement password;

    @FindBy(className = "button-1 login-button")
    public WebElement loginBtn;
}
