Feature: As a new user I would like to register on the website

  Scenario Outline: I would like to register
    Given I launch the home page
    And navigate to the registration page
    When I enter numbers for the "<firstname>" and "<lastname>" field
    And Enter correct "<gender>" "<day>" "<month>" "<year>" "<email>" "<password>" "<confirmPassword>"
    Then I should be informed that fisrtname and lastname is not correct

    Examples:
    |gender|firstname|lastname|day|month|year|email|password|confirmPassword|
    |male  |2hlo     |m0a8i   |18 |August|1989|tjMoabi@sqs.com|password|password|
    |female|$#@hlo   |Mo@bi   |19 |August|2014|thuhlo@gmail.com|password|password|


    Scenario Outline: I would like to register
      Given I launch the home page
      When I enter correct "<gender>" "<firstname>" "<lastname>" "<day>" "<month>" "<year>" "<password>" "<confirmPassword>"
      And I enter invalid "<email>"
      Then I should be informed that my email is not correct

      Examples:
        |gender|firstname|lastname|day|month|year|email|password|confirmPassword|
        |male  |Thuhlo    |moabi  |18 |August|1989|tjMoabisqs.com|password|password|
        |female|Refiloe  |moabi   |19 |August|2014|fifi@gmail    |password|password|


#  Scenario Outline: I want to register
#    Given I launch the home page
#    When I enter correct "<gender>" "<firstname>" "<lastname>" "<day>" "<month>" "<year>" "<email>"
#    And  "<password>" and "<confirmPassword>" do not match
#    Then I should be infromed that my paswords do not match
#
#    Examples:
#      |gender|firstname|lastname|day|month|year|email|password|confirmPassword|
#      |male  |2hlo     |m0a8i   |18 |August|1989|tjMoabi@sqs.com|password|password12|
#      |female|$#@hlo   |Mo@bi   |19 |August|2014|thuhlo@gmail.com|password11|password321|
