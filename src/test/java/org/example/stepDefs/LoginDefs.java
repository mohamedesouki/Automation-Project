package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P_Login;

public class LoginDefs {
    P_Login login = new P_Login();

 @Given("user go to login page")
    public void userLogin(){
     login.loginLink.click();
 }
}
