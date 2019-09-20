Feature: Login

   Scenario: Success Login 
    Given I want to create an Account
    When I Enter my data
    |name |password |
    |sam  | abcd123 |
    |man  | efgh123 |
    |nas  | idjkd123|
    Then I verify my acocunt