package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {

        WebDriver driver;

        public AddProductPage(){
            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
        private static WebElement addToCartOne;

        @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
        private WebElement addToCartTwo;

        @FindBy(xpath = "//a[@class='shopping_cart_link']")
        private WebElement btnCart;

        public void setAddToCartOne(){
            addToCartOne.click();
        }
        public void addToCartTwo(){
            addToCartTwo.click();
        }

        public void btnCart(){
            btnCart.click();
        }


}
