package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P_WishList;

public class WishListDef {
    P_WishList wishList = new P_WishList();

    @Given("user go to wishList page")
    public void goWish(){
        wishList.wishLink.click();
    }


}
