package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_Register {

    public P_Register(){
        PageFactory.initElements(Hooks.driver,this);

    }


    @FindBy(className = "ico-register")
    public WebElement registerLink;

    @FindBy(id = "gender-male")
    public WebElement gender_male;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

   @FindBy(name="DateOfBirthDay")
    public WebElement dayList;

    @FindBy(name="DateOfBirthMonth")
    public WebElement monthList;


    @FindBy(name="DateOfBirthYear")
    public WebElement yearList;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registration;

    @FindBy(className = "result")
    public WebElement successMsg;





























    /*
    public WebElement registerLink(){

        WebElement register = Hooks.driver.findElement(By.className("ico-register"));
        return register;
    }*/
}
