package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


     WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement txtProducts;

    public void loginUser(String username, String password) {

        if (this.username.getText() != null || this.password.getText() != null) {

            Utils.delay(2);
            this.username.clear();
            this.password.clear();
        }

        this.username.sendKeys(username);
        Utils.delay(2);
        this.password.sendKeys(password);
//        Utils.delay(1);

    }

    public void setBtnLogin(){
        btnLogin.click();
    }

    public String getTxtProduct(){
        return txtProducts.getText();
    }





}
