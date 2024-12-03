package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutProductPage {

    WebDriver driver;

    public CheckoutProductPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@name='checkout']")
    private WebElement btnCheckout;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement btnHome;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    private WebElement txtInformation;

    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")
    private WebElement txtErrorMessage;

    public String getTxtErrorMessage(){
        return txtErrorMessage.getText();
    }


    public String getTxtInformation(){
        return txtInformation.getText();
    }


    public void setBtnCheckout(){
        btnCheckout.click();
    }

    public void setInformation(String firstname, String lastname, String code) {
        if (this.firstName != null || this.lastName != null || this.postalCode != null) {
            Utils.delay(2);

            this.firstName.clear();
            this.lastName.clear();
            this.postalCode.clear();
        }

        this.firstName.sendKeys(firstname);
        this.lastName.sendKeys(lastname);
        this.postalCode.sendKeys(code);
    }


    public void setBtnContinue(){
        btnContinue.click();
    }

    public void setBtnFinish(){
        btnFinish.click();
    }

    public void setBtnHome(){
        btnHome.click();
    }


}
