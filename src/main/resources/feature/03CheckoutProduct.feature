Feature: Checkout Two Product

  Scenario: Customer remove product in swag labs
    Given Customer click button cart
    When Klik button remove product one
    Then Verifikasi remove product
    And Customer click button checkout
    And Verifikasi appearance Checkout Your Information

#------- negative test --------
  Scenario Outline: Customer Checkout Product with invalid information
    Given Customer input firstname "<firstname>" lastname "<lastname>" and postal code "<code>"
    When Customer click button continue
    Then Error with message "<error_massage>" will appear

    Examples:
      | firstname | lastname | code  | error_massage                  |
      | Ahmad     |          |       | Error: Last Name is required   |
      |           | Sobrani  |       | Error: First Name is required  |
      |           |          | 12630 | Error: First Name is required  |
      |           |          |       | Error: First Name is required  |
      | Ahmad     | Sobrani  |       | Error: Postal Code is required |
      | Ahmad     |          | 12630 | Error: Last Name is required   |
      |           | Sobrani  | 12630 | Error: First Name is required  |

    # --------- END NEGATIVE TEST -------------------

  Scenario Outline: Customer Checkout Product with valid information
    Given Customer input firstname "<firstname>" lastname "<lastname>" and postal code "<code>"
    When Customer click button continue
    Then Customer should be redirected to the Overview page
    And Customer click button finish
    And Customer should be redirected to the Complete page
    Examples:
      | firstname | lastname | code  |
      | Ahmad     | Sobrani  | 12630 |



