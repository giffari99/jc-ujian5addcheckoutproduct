package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

            private static WebDriver driver;

            static ExtentTest extentTest;

            private static LoginPage loginPage = new LoginPage();


            public LoginTest(){   // konstraktor
                driver = Hooks.driver;
                extentTest = Hooks.extentTest;
            }

            @Given("Customer on the SauceDemo login page")
            public void i_am_on_the_SauceDemo_login_page(){
                driver.get(Constants.URL);
                Utils.delay(2);
                extentTest.log(LogStatus.PASS,"I am on the SauceDemo login page");
            }


// -----------------------   negative test

            @And("Customer click button login")
            public void i_click_button_login(){
                Utils.delay(2);
                loginPage.setBtnLogin();
                extentTest.log(LogStatus.PASS,"I click button login");
            }


            @Given("Customer enter a valid username and no password")
            public void customer_enter_a_valid_username_and_no_password(){
                loginPage.loginUser("standard_user","");
           }

            @Given("Customer enter a valid password and no username")
            public void customer_enter_a_valid_password_and_no_username(){
                loginPage.loginUser("", "secret_sauce");
            }


// ------------------------ positive test


            @When("Customer enter a valid username and password")
            public void customer_enter_a_valid_username_and_password(){
                loginPage.loginUser("standard_user","secret_sauce");
            }


            @Then("Customer should be redirected to the product page")
            public void i_should_be_redirected_to_the_product_page(){
                Utils.delay(2);
                Assert.assertEquals(loginPage.getTxtProduct(),"Products");
                extentTest.log(LogStatus.PASS,"I should be redirected to the product page");

            }


}
