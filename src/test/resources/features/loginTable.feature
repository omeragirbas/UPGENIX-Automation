Feature: US-004 Login Functionality
  User Story:
  1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario Outline: Login with valid credential
    Given user write valid "<username>"
    When User types valid "<password>"
    And user click login button
    Then User sees "<expectedTitle>" is in the username

    @salesmanagertable @UPGNX-329
    Examples: search value we are going to be using in this scenario is as below
      | username                | password     | expectedTitle  |
      | salesmanager15@info.com | salesmanager | SalesManager15 |
      | salesmanager20@info.com | salesmanager | SalesManager20 |
      | salesmanager25@info.com | salesmanager | SalesManager25 |
      | salesmanager30@info.com | salesmanager | SalesManager30 |
      | salesmanager31@info.com | salesmanager | SalesManager31 |
      | salesmanager32@info.com | salesmanager | SalesManager32 |
      | salesmanager33@info.com | salesmanager | SalesManager33 |

    @posmanagertable @UPGNX-330
    Examples:
      | username              | password   | expectedTitle |
      | posmanager15@info.com | posmanager | POSManager15  |
      | posmanager20@info.com | posmanager | POSManager20  |
      | posmanager25@info.com | posmanager | POSManager25  |
      | posmanager30@info.com | posmanager | POSManager30  |
      | posmanager31@info.com | posmanager | POSManager31  |
      | posmanager32@info.com | posmanager | POSManager32  |
      | posmanager33@info.com | posmanager | POSManager33  |