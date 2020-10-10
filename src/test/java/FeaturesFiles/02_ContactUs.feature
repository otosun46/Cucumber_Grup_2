Feature: Contact us click and send mesage

  Background:
    Given Navigate to automationpractice
    When Enter username and password,  click Login button
    Then User should  login successfully

  Scenario:
    Given Navigate to Contact us
    When Send mesage
    Then Error message shuld be diplayed

  Scenario Outline:
    Given Navigate to Contact us
    When Select message "<Heading>" and "<OrderReference>" and "<Product>"
    Then Fill in the message "<Message>"
    When Send mesage
    And Send mesage successfull

    Examples:
      | Heading | OrderReference | Product | Message                                  |
      | 1       | 0              | 1       | Products do not look good on the website |
      | 1       | 1              | 1       | The product is not good at all           |
      | 2       | 0              | 0       | The product is better                    |
      | 2       | 1              | 1       | You should sell more modern products     |
