@UPGNX-297
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
  @logout @UPGNX-381
  Scenario: User can log out and ends up in login page.
    When User click on the username
    And User verify logout link available
    And User click Log out
    When verify page after logout and see login page

    #AC2Logout
  @logout2 @UPGNX-382
  Scenario: The user can not go to the home page again by clicking the step back button after successfully logged out.
    When User click on the username
    And User click Log out
    And verify page after logout and see login page
    When user click step back icon
    Then verify "Odoo Session Expired" message



