@login @regression
Feature: Login

  Background:
    Given The client is in landing page

  @successfulLogin
  Scenario: Successful login with valid credentials
    When the client clicks on the My Account menu
    And the client enters registered username "valumorettiarias@gmail.com" in the username textbox
    And the client enters valid password "contraseniasegura" in the password textbox
    And the client clicks on the Login button
    Then the client should see the My Account dashboard

  @unsuccessfulLogin
  Scenario Outline: Unsuccessful login with <credentialConditions> inputs
    When the client clicks on the My Account menu
    And the client enters registered username "<username>" in the username textbox
    And the client enters valid password "<password>" in the password textbox
    And the client clicks on the Login button
    Then the error message "<errorMessage>" should be displayed

    @emptyPassword
    Examples:
      | credentialConditions                | username                     | password          | errorMessage                 |
      | filled username and empty password  | valumorettiarias@gmail.com   |                   | Error: Password is required  |

    @emptyUsername
    Examples:
      | credentialConditions                | username                     | password          | errorMessage                 |
      | empty username and filled password  |                              | contraseniasegura | Error: Username is required  |

    @emptyUsernameAndPassword
    Examples:
      | credentialConditions                | username                     | password          | errorMessage                 |
      | empty username and empty password   |                              |                   | Error: Username is required  |

  @loginFailWithCaseChanged
  Scenario: Verify login fail with case changed username and password
    When the client clicks on the My Account menu
    And the client enters the case changed username "VALUMORETTIARIAS@GMAIL.COM" in the username textbox
    And the client enters the case changed password "CONTRASENIASEGURA" in the password textbox
    And the client clicks on the Login button
    Then login must fail saying incorrect username-password

  @loginWithCaseChangedUsername
  Scenario: Verify login with case changed username
    When the client clicks on the My Account menu
    And the client enters the case changed username "VALUMORETTIARIAS@GMAIL.COM" in the username textbox
    And the client enters valid password "contraseniasegura" in the password textbox
    And the client clicks on the Login button
    And the client clicks on Sign out
    And the client presses back button
    Then the client shouldn't be signed in to his account