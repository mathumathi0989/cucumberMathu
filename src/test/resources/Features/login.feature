@login
Feature: Verify login functionality


  Scenario: Verify if user is able to login without any error
    Given user is on login page
    When user enters "userName" and "password"
    And click on signin 
    Then user should be able to logged in 
    And verify signin button changed to account


