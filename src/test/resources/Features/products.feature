Feature: Product Scenarios

  Scenario Outline: Validate product info on products page
    Given the user is on the product page upon successful login
    Then validate the product is listed with tittle "<tittle>" nad "<price>"

    Examples:
    |         tittle        | price |
    |Sauce Labs Bolt T-Shirt| $15.99|

  Scenario Outline: Validate product info on product details page
    Given the user is on the product page upon successful login
    When user clicks on product tittle "<tittle>"
    Then user should be on  product details page with tittle "<tittle>", price "<price>" and "<description>"

    Examples:
    |      tittle       |price |description|
    |Sauce Labs Backpack|$29.99|carry.allTheThing() with the sleek, streamlined Sly|