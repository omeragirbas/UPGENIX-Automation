Feature: US-004 Login Functionality
  User Story:
  1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  2-"Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials

  3- "Please fill out this field" message should be displayed if the password or username is empty

  4-User land on the ‘reset password’ page after clicking on the "Reset password" link

  5-User should see the password in bullet signs by default

  6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.

  Accounts are: PosManager, SalesManager

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page
@salesmanager
  Scenario: Login as SalesManager
    When user enters SalesManager username
    And user enters SalesManager password
    And user click login button
    Then user should see the dashboard
@posmanager
  Scenario: Login as PosManager
    When user enters PosManager username
    And user enters PosManager password
  And user click login button
    Then user should see the dashboard