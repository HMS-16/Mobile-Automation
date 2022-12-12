Feature: Admin register new user

  @InvalidCredentialsforNurse
  Scenario Outline: Admin want to register new Nurse with Invalid credentials
    Given User has successfully sign in as admin to mediclinic app by input valid  email and password
    When user input invalid <name>, <registerNumber>, <email>, <password> and <confirmationPassword>
    And user choose role as a nurse
    And user click register button
    Then system verifying condition <name>, <registerNumber>, <email>, <password> and <confirmationPassword>

    Examples: 
      | name      | registerNumber | email            | password | confirmationPassword |
      |           |       12345678 | nurse1@gmail.com | password | password             |
      | nurseExam |                | nurse1@gmail.com | password | password             |
      | nurseExam |       62216427 | nurse1@gmail.com | password | password             |
      | nurseExam |       12345678 |                  | password | password             |
      | nurseExam |       12345678 | nurse1@          | password | password             |
      | nurseExam |       12345678 | nurse1@gmail.com |          | password             |
      | nurseExam |       12345678 | nurse1@gmail.com | password |                      |
      | nurseExam |       12345678 | nurse1@gmail.com | sasasasa | password             |

  @InvalidCredentialsforDoctor
  Scenario Outline: Admin want to register new Doctor with Invalid credentials
    Given User has successfully sign in as admin to mediclinic app by input valid  email and password
    When user input invalid <name>, <registerNumber>, <email>, <password> and <confirmationPassword>
    And user choose role as a doctor
    And user click register button
    Then system verifying condition <name>, <registerNumber>, <email>, <password> and <confirmationPassword>

    Examples: 
      | name      | registerNumber | email            | password | confirmationPassword |
      |           |       32345678 | doctr1@gmail.com | password | password             |
      | doctExamp |                | doctr1@gmail.com | password | password             |
      | doctExamp |       62216427 | doctr1@gmail.com | password | password             |
      | doctExamp |       32345678 |                  | password | password             |
      | doctExamp |       32345678 | doctr1@gmail.com |          | password             |
      | doctExamp |       32345678 | doctr1@gmail.com | password |                      |
      | doctExamp |       32345678 | doctr1@gmail.com | sasasasa | password             |

  @ValidCredentialsfornurse
  Scenario Outline: Admin want to register new Nurse with valid credentials
    Given User has successfully sign in as admin to mediclinic app by input valid  email and password
    When user input valid <name>, <registerNumber>, <email>, <password> and <confirmationPassword>
    And user choose role as a nurse
    And user click register button adn yes on the pop up buttom
    Then system verifying condition <name>, <registerNumber>, <email>, <password> and <confirmationPassword> and display the pop up that new user successfully registered

    Examples: 
      | name      | registerNumber | email            | password | confirmationPassword |
      | nurseExam |       12345678 | nurse1@gmail.com | password | password             |

  @ValidCredentialsfordoctor
  Scenario Outline: Admin want to register new Nurse with valid credentials
    Given User has successfully sign in as admin to mediclinic app by input valid  email and password
    When user input valid <name>, <registerNumber>, <email>, <password> and <confirmationPassword>
    And user choose role as a nurse
    And user click register button adn yes on the pop up buttom
    Then system verifying condition <name>, <registerNumber>, <email>, <password> and <confirmationPassword> and display the pop up that new user successfully registered

    Examples: 
      | name      | registerNumber | email            | password | confirmationPassword |
      | doctrExam |       32345678 | doctr1@gmail.com | password | password             |
