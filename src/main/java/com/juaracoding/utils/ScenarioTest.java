package com.juaracoding.utils;

public enum ScenarioTest {

    // T1 - T1000
    // feature Login
    T1("Invalid login without username and password"),
    T2("Invalid login without password"),
    T3("Invalid login without username"),
    T4("Success login with valid akun"),

    //feature addtocart
    T5("Customer add new products"),
    T6("Customer remove product"),
    T7("Customer remove product in swag labs"),
    T8("Customer Checkout Product with invalid information"),
    T9("Customer Checkout Product with invalid information"),
    T10("Customer Checkout Product with invalid information"),
    T11("Customer Checkout Product with invalid information"),
    T12("Customer Checkout Product with invalid information"),
    T13("Customer Checkout Product with invalid information"),
    T14("Customer Checkout Product with invalid information"),
    T15("Customer Checkout Product with valid information");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;

    }

    public String getScenarioTestName(){

        return scenarioTestName;

    }


}
