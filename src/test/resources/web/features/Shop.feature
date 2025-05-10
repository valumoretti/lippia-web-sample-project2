Feature: Definir


  Scenario: Verifying landing page has only '3' sliders
    Given The client is in landing page
    Then the client can check that has only '3' sliders

    Scenario: Verifying landing page has only '3' arrivals
      Given The client is in landing page
      Then the client can check that has only '3' arrivals
      #podré unificar el código del step 6 y el 10 colocando como parámetro sliders y arrivals?


