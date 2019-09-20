Feature: Login

  # Scenario: Success Login
   # Given Enter user name in the userid field
   # And Enter password in the password field
   # When Click on login buttin
   # Then Home page is displayed
@regression
   Scenario: Success Login with actual values
    Given Enter "sam" and "abcd123"
    When Click on login buttin
    Then Home page is displayed
 @smoke   
  Scenario: Login Failure
    Given Enter credentials
    When Click on login buttin
    Then Home page is not displayed