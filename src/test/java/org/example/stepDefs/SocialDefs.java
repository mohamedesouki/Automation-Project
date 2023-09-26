package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.NopCommerce;
import org.testng.Assert;

import java.util.ArrayList;

public class SocialDefs {
    NopCommerce nopCommerce = new NopCommerce();

    @Given("user go to facebook page")
    public void user_go_to_facebook_page() throws InterruptedException {
        nopCommerce.facebook.click();


    }

   @Then("link open successfully")
    public void linkOpenSuccessfully() throws InterruptedException {
       ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
       Hooks.driver.switchTo().window(tabs.get(1));
       Thread.sleep(2000);
        String expected = "https://www.nopcommerce.com/en";
        String url =  Hooks.driver.getCurrentUrl();

        Assert.assertEquals(url,expected);


    }

    @Given("user go to twitter page")
    public void userGoToTwitterPage() {
        nopCommerce.twitter.click();
    }

    @Then("link open twitter successfully")
    public void linkOpenTwitterSuccessfully() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        String expected = "https://twitter.com/nopCommerce";
        String url =  Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url,expected);
    }


    @Given("user go to youtube page")
    public void userGoToYoutubePage() {
        nopCommerce.youtube.click();
    }

    @Then("link open youtube successfully")
    public void linkOpenYoutubeSuccessfully() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        String expected = "https://www.youtube.com/user/nopCommerce";
        String url =  Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url,expected);
    }
}
