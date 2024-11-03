Feature: Checkout Two Product

  Scenario: Customer Checkout Product
    Given Customer click button checkout
    When Customer input firstname
    And Customer input lastname
    And Customer input postalcode
    And Customer click button continue
    And Customer click button finish
    Then Customer click button back home