Feature: As a new user I would like to register on the website.

  Scenario Outline: Registration
    Given I go to the homepage
    When I click Register
    And Enter the correct details "<gender>" "<firstname>" "<lastname>" "<day>" "<month>" "<year>" "<email>" "<password>" "<confirmPassword>"
    Then  I should be directed to the homepage with user details displayed

    Examples:
    |gender|firstname|lastname|day|month|year|email|password|confirmPassword|
    |male  |Thuhlo   |Moabi   |18 |August   |1989|tjMoabi@sqs.com|password|password|



    Scenario Outline: Re-registration
      Given I go to the homepage
      When I click Register
      And Enter the correct details "<gender>" "<firstname>" "<lastname>" "<day>" "<month>" "<year>" "<email>" "<password>" "<confirmPassword>"
      Then I should be informed that I cannot register twice

      Examples:
        |gender|firstname|lastname|day|month|year|email|password|confirmPassword|
        |male  |Thuhlo   |Moabi   |18 |August   |1989|tjMoabi@sqs.com|password|password|

