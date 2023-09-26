package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_AddCart;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AddCartDef {
    P_AddCart addCart = new P_AddCart();

    @Given("user select item")
    public void addCart(){
        addCart.elementList.get(1).click();
    }

    @When("user go to Shopping Cartpage")
    public void userGoToShoppingCartpage() throws InterruptedException {


        String expectedUrl = "https://demo.nopcommerce.com/apple-macbook-pro-13-inch";
        Thread.sleep(3000);
        String currentUrl =  Hooks.driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.toLowerCase().contains(expectedUrl));

    }

    @And("user select the item")
    public void userSelectTheItem() {
        addCart.add.click();
    }

    @Then("the item selected successfully")
    public void theItemSelectedSuccessfully() {
        boolean appear = addCart.notification.isEmpty();
        Assert.assertEquals(false,appear);
        System.out.println(appear);
    }
}
