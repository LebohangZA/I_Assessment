Feature: Sign Up To Receive Focus Insights

  Scenario Outline: user should be able to sign up to receive Focus insights successfully
    Given user navigates to the Investec website
    And user searches for <Cash Investment Rates information> page
    Then user navigates to Understanding Cash Investment Interest Rates page
    When user is on the Understanding Cash Investment Interest Rates page
    Then user clicks on the sign up button
    Then user inputs name <name>
    And user inputs surname <surname>
    And user inputs email <email>
    And user clicks on myself radio button
    Then user clicks the submit button
    And user has signed up to receive Focus insights successfully

    Examples:
      | name     | surname      | email               | Cash Investment Rates information|
      | Lebohang | Tlhoaele     | test@investec.co.za | Cash Investment Rates            |