package com.juaracoding;

import com.juaracoding.pages.AddProductPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddProductTest {

     static WebDriver driver;

     static ExtentTest extentTest;

     private static final AddProductPage addProductPage = new AddProductPage();

    public AddProductTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

   @Given("Customer add one product")
   public void customer_add_one_product(){
        addProductPage.setAddToCartOne();
       Utils.delay(2);
   }

    @When("Customer adds one more product")
    public void customer_adds_one_more_product (){
        addProductPage.addToCartTwo();
        Utils.delay(2);
    }

    @Then("Customer click button cart")
    public void customer_click_button_cart(){
        addProductPage.btnCart();
    }


}