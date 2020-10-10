Feature: Specials click and control

  Background:
    Given Navigate to automationpractice
    When Enter username and password,  click Login button
    Then User should  login successfully

  Scenario:

    Given Navigate to Specials

    When Find the number of products on the page "products" and "7"

    Then List the names of the products "products"

    And Find the number of products on the page "productsOfSale" and "2"

    And List the name of the products on sale "productsOfSale"
