Feature: Sign In

  @InvalidCredentials
  Scenario Outline: user want to sign in with Invalid credentials
    Given user navigated to Sign in page of Mediclinic App
    When user input invalid <email> and <password>
    And user click login button
    Then system verifying condition <email> and <password> and display the validation message error

    Examples: 
      | email              | password |
      | abed               | password |
      | abednego@gmail.com | kaka     |
      | kaka@gmail.com     | password |
      |                    | password |
      | abednego@gmail.com |          |
      |                    |          |

  @ValidCredentials
  Scenario Outline: user want to login with Valid credentials
    Given user navigated to login page
    When user fill <email> and <password>
    And user click login button
    Then system verifying condition <email> and <password> and navigated to homepage

    Examples: 
      | email                 | password |
      | abednego@gmail.com    | password |
      | natasya@gmail.com     | password |
      | adminmobile@gmail.com | password |
