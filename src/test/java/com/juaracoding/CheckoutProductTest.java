package com.juaracoding;

import com.juaracoding.pages.AddProductPage;
import com.juaracoding.pages.CheckoutProductPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutProductTest {

        static WebDriver driver;

        static ExtentTest extentTest;

        static CheckoutProductPage checkoutProductPage = new CheckoutProductPage();

        public CheckoutProductTest(){
            driver = Hooks.driver;
            extentTest = Hooks.extentTest;
        }

        @And("Customer click button checkout")
        public void customer_click_button_checkout(){
            Utils.delay(2);
            checkoutProductPage.setBtnCheckout();
            Utils.delay(2);
        }

        @Then("Verifikasi appearance Checkout Your Information")
        public void verifikasi_appearance_checkout_your_information(){
            Assert.assertEquals(checkoutProductPage.getTxtInformation(),"Checkout: Your Information");
        }


        @Given("Customer input firstname {string} lastname {string} and postal code {string}")
        public void customer_input_firstname_lastname_and_postal_code(String firstname, String lastname, String code){
            checkoutProductPage.setInformation(firstname, lastname, code);
            extentTest.log(LogStatus.PASS, "Customer input firstname "+firstname+" lastname "+lastname+"and postal code "+code);
        }


        @When("Customer click button continue")
        public void customer_click_button_continue(){
            checkoutProductPage.setBtnContinue();
        }

        @Then("Error with message {string} will appear")
        public void error_with_message__will_appear(String ErrorMessage){
            Utils.delay(3);
            Assert.assertTrue(checkoutProductPage.getTxtErrorMessage().contains(ErrorMessage));

        }






//
//        @And("Customer click button continue")
//        public void customer_click_button_continue(){
//        checkoutProductPage.setBtnContinue();
//            Utils.delay(2);
//        }
//
//        @And("Customer click button finish")
//        public void customer_click_button_finish(){
//        checkoutProductPage.setBtnFinish();
//            Utils.delay(2);
//        }
//
//        @Then("Customer click button back home")
//        public void customer_click_button_back_home(){
//        checkoutProductPage.setBtnHome();
//        }


}
