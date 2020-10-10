Feature: Specials click and control

  Background:
    Given Navigate to automationpractice
    When Enter username and password,  click Login button
    Then User should  login successfully

  Scenario:

    Given Navigate to Order History

    When Find the number of products on the page "orderReferens" and "2"

    Then List the name of the products on sale "orderReferens"


