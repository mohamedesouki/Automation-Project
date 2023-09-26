package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class RegStepDef {



    P_Register register = new P_Register();


    @Given("user go to register page")
    public void user_go_to_register() {
       register.registerLink.click();
    }

    @When("user select gender")
    public void userSelectGender() {
      register.gender_male.click();
    }

    @And("user enter {string} & {string}")
    public void userEnter(String firstName, String lastName) {
    register.firstName.sendKeys(firstName);
    register.lastName.sendKeys(lastName);
    }

   @And("user select date of birth")
    public void userSelectDateOfBirth() {
        Select select = new Select(register.dayList);
        select.selectByValue("1");

       Select select2 = new Select(register.monthList);
        select2.selectByIndex(10);

       Select select3 = new Select(register.yearList);
        select3.selectByValue("1999");

    }

    @And("user enter email")
    public void userEnter() {
        Faker faker = new Faker();
        String emailAddress = faker.internet().safeEmailAddress();
        register.email.sendKeys(emailAddress);
    }

    @And("user enter {string} password")
    public void userEnterPassword(String password) {
        register.confirmPassword.sendKeys(password);
        register.password.sendKeys(password);
    }





    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.registration.click();
        register.registration.click();
    }

       @Then("account is created successfully")
    public void accountIsCreatedSuccessfully() {
       // *//*SoftAssert soft = new SoftAssert();
        //soft.assertTrue();

        //String actualColor = register.successMsg.getCssValue("color");
        //soft.assertEquals(Color.fromString(actualColor).asHex(),"#4cb17c");

        //soft.assertAll()
           Assert.assertTrue(register.successMsg.getText().toLowerCase().contains("your registration completed"));
    }

}
