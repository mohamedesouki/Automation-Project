package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void openBrowser(){
       // WebDriverManager.chromedriver().setup();
       // WebDriverManager.firefoxdriver().setup();

        String KEY = "webdriver.chrome.driver";
        String VALUE = "C:\\Users\\Mohamed Desouky\\Desktop\\POM_Design_Pattern\\Browser\\chromedriver.exe";

        System.setProperty(KEY,VALUE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

    }


    @After
    public static void quitBrowser() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }

}
