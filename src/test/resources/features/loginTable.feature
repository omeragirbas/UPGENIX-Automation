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

    @salesmanagertable
    Examples: search value we are going to be using in this scenario is as below
      | username                | password     | expectedTitle  |
      | salesmanager15@info.com | salesmanager | SalesManager15 |
      | salesmanager20@info.com | salesmanager | SalesManager20 |
      | salesmanager25@info.com | salesmanager | SalesManager25 |
      | salesmanager30@info.com | salesmanager | SalesManager30 |

    @posmanagertable
    Examples:
      | username              | password   | expectedTitle |
      | posmanager15@info.com | posmanager | posmanager15  |
      | posmanager20@info.com | posmanager | posmanager20  |
      | posmanager25@info.com | posmanager | posmanager25  |
      | posmanager30@info.com | posmanager | posmanager30  |