@UPGNX-286
Feature: US-004 Login Functionality
  User Story:

  2-"Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials

  3- "Please fill out this field" message should be displayed if the password or username is empty

  4-User land on the ‘reset password’ page after clicking on the "Reset password" link

  5-User should see the password in bullet signs by default

  6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.

  Accounts are: PosManager, SalesManager

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page
    #AC2
  @UPGNX-331
  Scenario Outline:Invalid username , valid password
    When User gives email in the "<email>" input box
    And User gives password in the "<password>" input box
    And user click login button
    Then User sees Wrong login, password text
    @ac2s1 @UPGNX-331
    Examples:
      | email                | password     |
      | salesmana15@info.com | salesmanager |
      | salesmana20@info.com | salesmanager |
      | salesmana25@info.com | salesmanager |
    @ac2s2 @UPGNX-331
    Scenario Outline:Valid username , invalid password
      When User gives email in the "<email>" input box
      And User gives password in the "<password>" input box
      And user click login button
      Then User sees Wrong login, password text
    Examples:
      | email                   | password        |
      | salesmanager15@info.com | salesmanagerrr  |
      | salesmanager15@info.com | 123salesmanager |
      | salesmanager15@info.com | salesm223anager |

    @ac2s3 @UPGNX-331
    Scenario Outline:Inalid username , invalid password
      When User gives email in the "<email>" input box
      And User gives password in the "<password>" input box
      And user click login button
      Then User sees Wrong login, password text
    Examples:
      | email                      | password          |
      | salesmanagwwer15@info.com  | salesmanagerrr34  |
      | salesccvmanager15@info.com | 123salesmana33ger |
      | salesmanager15@inf777o.com | salesm223anag5er  |

  #AC3
  @ac3s1 @UPGNX-332
  Scenario: username empty User will see "please fill out this field"
    When username empty
    And user click login button
    Then User sees please fill out this field text

  @ac3s2 @UPGNX-332
  Scenario: password empty User will see "please fill out this field"
    Given write any text username
    When password empty
    And user click login button
    Then User sees please fill out this field text

  #AC4
  @ac4 @UPGNX-333
  Scenario: 4-User land on the ‘reset password’ page after clicking on the "Reset password" link
    When click reset password button
    Then User sees reset password page
  #AC5
  @ac5 @UPGNX-334
  Scenario: 5-User should see the password in bullet signs by default
    Given write any text username
    And write any text password
    Then User sees bullet sign in password line when text
 #AC6
  @ac6s1 @UPGNX-335
  Scenario:  6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    When user enters SalesManager username
    And user enters SalesManager password
    Then user send key enter not click

  @ac6s2 @UPGNX-335
  Scenario:  6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    When user enters PosManager username
    And user enters PosManager password
    Then user send key enter not click


