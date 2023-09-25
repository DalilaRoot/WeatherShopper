
Feature: Shop for moisturizers
  Scenario: Shop  on weather
    Given Go to home page
    When click on moisturizers
    Then check if you are on moisturizers
    Then check if product titles and prices are visible
    Then Add first product to card
    When Go to checkout page
    Then then check if the product in card is the first product
    When click to pay with card
    And add card informations
    Then check if payement is Successed








