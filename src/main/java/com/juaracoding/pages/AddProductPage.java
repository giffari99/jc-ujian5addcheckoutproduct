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

        @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
        private WebElement totalProduct2;

        @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
        private WebElement btnRemove;

        @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
        private WebElement totalProduct1;


        public String getTotalProduct1(){
            return totalProduct1.getText();
        }


        public void setBtnRemove(){
            btnRemove.click();
        }

        public String getTotalProduct2(){
            return totalProduct2.getText();
        }

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
