Feature: Gmail Testing

  Background: 
    Given user is on the gmail Login page
    Then user has entered the username

  Scenario: Compose Email
    When user has entered the password
    Then user is on gmail page
    When user has clicked on the compose button
    And user has filled the to subject content
    Then user has clicked on the sent button
 
  Scenario: Gmail logout
    When user has entered the password
    Then user is on gmail page
    When user sees the logout button visible
    Then user clicks on logout
    And user closes the browser

  Scenario: Negative Scenario
    But user has entered wrong password  
    And wrong password message is displayed
