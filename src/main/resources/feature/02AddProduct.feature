Feature: Menambahkan Product

  Scenario: Customer add new products
    Given Customer add one product
    When Customer adds one more product
    Then Verifikasi add product


  Scenario: Customer remove product
    Given Klik button remove product one
    Then Verifikasi remove product
    And Customer add one product
    And Verifikasi add product

