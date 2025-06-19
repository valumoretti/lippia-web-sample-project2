@myAccount @regression
Feature: My account

  Background:
    Given The client is in landing page

  @accountDetails @trabajoFinal
  Scenario: Verify client can view account details
    When the client clicks on the My Account menu
    And the client enters registered username "valumorettiarias@gmail.com" in the username textbox
    And the client enters valid password "contraseniasegura" in the password textbox
    And the client clicks on the Login button
    And the client clicks on the My Account menu
    And the client clicks on Account details
    Then client can view account details where he could change his password also

  @logOutSuccessfully @trabajoFinal
  Scenario: Verify the client can successfully log out
    When the client clicks on the My Account menu
    And the client enters registered username "valumorettiarias@gmail.com" in the username textbox
    And the client enters valid password "contraseniasegura" in the password textbox
    And the client clicks on the Login button
    And the client clicks on the My Account menu
    And the client clicks on Logout button
    Then the client shouldn't be signed in to his account