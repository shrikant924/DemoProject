@login
Feature: verify login functionality

  Scenario Outline: User is able to login with valid credentials
    Given User is on login page
    Then Enter <RMN> and <OTP>
    And Click on proceed button
    Then Verify user is logged in successfully or not
    Examples:
      | RMN        | OTP    |
      | 8374673254 | 938205 |
      | 9483434343 | 938205 |
      | 8347348322 | 938205 |
      | 8474834343 | 938205 |



