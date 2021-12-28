Feature: Login Features

  Scenario Outline: Login is unsuccessful with invalid credentials
    When user  enters username "<username>" and password "<password>"
    And click on login button
    Then user should get error message "<error>"

    Examples:
    |username        |password        |error                                                       |
    |invalidUserName |secret_sauce    |Username and password do not match any user in this service.|
    |problem_user    |invalidPassword |Username and password do not match any user in this service.|

  Scenario Outline:  Login is successful with valid credentials
    When user  enters username "<username>" and password "<password>"
    And click on login button
    Then user should see product page with tittle "<tittle>"

    Examples:
    |   username    |    password     | tittle |
    | problem_user  |  secret_sauce   | LOGIN  |