Feature:  Blazedemo

  @Blaze
  Scenario: Blazedemo site flight search
    Given User lands in url "https://blazedemo.com"
    When User selects "Paris" and "Rome"
    And User click on find button
    Then User should land on flight booking page
