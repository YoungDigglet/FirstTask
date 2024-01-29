Feature: ChooseSmartwatches

  Background:
    Given User open homepage

  Scenario: User choose without subscription label from smartwatches section in devices button menu
    And User click on Device button
    And User click on without subscription label
    Then User choose first item from smartwatches list
    And User add product to basket
    And User will be redirect to home page
