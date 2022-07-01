Feature: US-005 Log out Functionality
  User Story:
  AC1- User can log out and ends up in login page.

  AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.

  Background: For the scenarios in the feature file, user is expected to be on login page and valid credential
    Given user is on the login page
    When user enters SalesManager username
    And user enters SalesManager password
    And user click login button
    Then user should see the dashboard


     #AC1Logout
  @logout
  Scenario: User can log out and ends up in login page.
    When User click on the username
    And User click Log out
    And user is on the login page
    When verify page after logout click back




