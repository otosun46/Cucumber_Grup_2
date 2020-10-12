Feature: Specials click and control

  Background:
    Given Navigate to automationpractice
    When Enter username and password,  click Login button
    Then User should  login successfully

  Scenario:

    Given Navigate to Order History

    Then Order list "orderReferens"

    When On the order "orderReferens" list, verify that the order number is "3"

    And Print the names of the products in the orders "orderReferens"



