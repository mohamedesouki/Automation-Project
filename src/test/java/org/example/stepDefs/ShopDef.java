package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P_ShoppingCart;

public class ShopDef {
    P_ShoppingCart shoppingCart = new P_ShoppingCart();

    @Given("user go to Shopping Cart page")
    public void go_Shopping_Cart(){
        shoppingCart.shopLink.click();
    }


}
