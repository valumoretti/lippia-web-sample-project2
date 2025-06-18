@myAccount @regression
Feature: My account

  Background:
    Given The client is in landing page

  @accountDetails
  Scenario: Verify client can view account details
    When the client clicks on the My Account menu
    And the client enters registered username "valumorettiarias@gmail.com" in the username textbox
    And the client enters valid password "contraseniasegura" in the password textbox
    And the client clicks on the Login button
    And the client clicks on My account link
    And the client clicks on Account details
    Then client can view account details where he can change his pasword algo

  @logOut
  Scenario: Verify the client can succesfully log out
    When the client clicks on the My Account menu
    When the client clicks on the My Account menu
    And the client enters registered username "valumorettiarias@gmail.com" in the username textbox
    And the client enters valid password "contraseniasegura" in the password textbox
    And the client clicks on the Login button
    And the client clicks on My account link
    And the client click on Logout button
    Then the client succesfully comes out from the site