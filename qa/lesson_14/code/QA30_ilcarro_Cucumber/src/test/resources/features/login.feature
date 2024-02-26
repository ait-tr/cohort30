Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on the Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message is displayed
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on the Login link
    And User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message is displayed
    And User quites browser
    Examples:
      | email       | password    |
      | neuer@gm.co | Neuer123455 |
      | neuer@gm.co | neuer12345! |
      | neuer@gm.co | NEUER12345! |
      | neuer@gm.co | Neuerrrrrr! |
      | neuer@gm.co | 1234567899! |
