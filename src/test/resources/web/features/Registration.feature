@registration @regression
Feature: Registration

  Background:
    Given The client is in landing page

  @registrationWithEmptyPassword
  Scenario: Verify that registration with an empty password fails
    When the client clicks on the My Account menu
    And the client enters "valumorettiarias@gmail.com" in the Email address textbox
    And the client leaves the password textbox empty
    And the client clicks on Register button
    Then the registration must fail and show a message

  @registrationWithEmptyEmailAndPassword
  Scenario: Verify that registration with an empty email and password fails
    When the client clicks on the My Account menu
    And the client enters "" in the Email address textbox
    And the client leaves the password textbox empty
    And the client clicks on Register button
    Then the registration must fail and show a message