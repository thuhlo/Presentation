Feature: As a registered user I would like to log into the system

  Scenario Outline: I would like to log into the website
    Given I navigate to homepage
    And click log-in
    When enter valid "<username>" and "<password>"
    Then I should be logged into the system

    Examples:
    |username|password|
    |tjMoabi@sqs.com|password|


    Scenario Outline: I would like to log into the website
      Given I navigate to homepage
      And click log-in
      When enter invalid "<username>" and "<password>"
      Then I should be informed that I used wrong credentials

      Examples:
      |username|password|
      |Moabitj@sqs.com|wordPass|