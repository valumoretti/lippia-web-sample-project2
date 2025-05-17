@login @regression
Feature: Login

  Background:
    Given The client is in landing page

  @unsuccessfulLogin
  Scenario Outline: Unsuccessful login with <credentialConditions> inputs
    When the client clicks on the My Account menu
    And the client enters "<username>" in the username textbox
    And the client enters "<password>" in the password textbox
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