Feature: Login Functionality

  Scenario: Valid Login
    Given I am on the login page
    When I enter username "john@example.com" and password "password123"
    Then I should be logged in successfully