Feature:
  Background:
  Scenario: Validate first name field
    Given User needs to be on FB Login Page
    When User enters first name
    Then User checks if the first name is present
    But User last name field should be blank



