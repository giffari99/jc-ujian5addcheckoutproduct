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
    T6("Customer Checkout Product");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;

    }

    public String getScenarioTestName(){

        return scenarioTestName;

    }


}
