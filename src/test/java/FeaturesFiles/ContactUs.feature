Feature: Contact us click and send mesage

  Background:
    Given Navigate to automationpractice
    When Enter username and password,  click Login button
    Then User should  login successfully

  Scenario:
    Given Navigate to Contact us
    When Send mesage
    Then Error message shuld be diplayed

  Scenario:
    Given Navigate to Contact us
    And Mesage steps select
    When Fill mesage
    Then Send mesage
    And Send mesage successfull

