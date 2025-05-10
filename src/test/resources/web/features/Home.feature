Feature: Home
    #steps conecta con services, y services con las constantes

  Scenario: Verifying landing page has only '3' sliders
    Given The client is in landing page
    Then the client can check that has only '3' sliders

  Scenario: Verifying landing page has only '3' arrivals
    Given The client is in landing page
    Then the client can check that has only '3' arrivals
      #podré unificar el código del step 6 y el 10 colocando como parámetro sliders y arrivals?

  Scenario: Verifying navigation through an image in the Arrivals section
    Given The client is in landing page
    When the client clicks on the Shop menu
    And the client clicks on the Home menu
    Then the client can check that the Home page has only '3' arrivals
    When the client clicks on one image in the Arrivals section
    Then the client can verify that it navigates to a page where the book can be added to the basket