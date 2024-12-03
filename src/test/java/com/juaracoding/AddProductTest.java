package com.juaracoding;

import com.juaracoding.pages.AddProductPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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

    @Then("Verifikasi add product")
    public void verifikasi_add_product(){
        Assert.assertEquals(addProductPage.getTotalProduct2(),"2");
    }

    @And("Customer click button cart")
    public void customer_click_button_cart(){
        addProductPage.btnCart();
    }

    @Given("Klik button remove product one")
    public void klik_button_remove_product_one(){
        Utils.delay(2);
        addProductPage.setBtnRemove();
    }

    @Then("Verifikasi remove product")
    public void verifikasi_remove_product(){
        Utils.delay(2);
        Assert.assertEquals(addProductPage.getTotalProduct1(),"1");
    }


}