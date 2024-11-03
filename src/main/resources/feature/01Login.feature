Feature: Login

# negative test
  Scenario: Invalid login without username and password
    Given Customer on the SauceDemo login page
    When Customer click button login

  Scenario: Invalid login without password
    Given Customer enter a valid username and no password
    When Customer click button login
#
  Scenario: Invalid login without username
    Given Customer enter a valid password and no username
    When Customer click button login

# Positiv test
  Scenario: Success login with valid akun
    Given Customer on the SauceDemo login page
    When Customer enter a valid username and password
    And Customer click button login
    Then Customer should be redirected to the product page
