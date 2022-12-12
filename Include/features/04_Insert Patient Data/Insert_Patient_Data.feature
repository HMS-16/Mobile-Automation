Feature: Insert Patient Data

  @InsertInvalidMedicalRecord
  Scenario Outline: Nurse as user want to insert patient medical record
    Given user has successfully sign in as nurse to mediclinic app by input valid  email and password
    When user click patient section
    And user click one from the list patient and click medical record section
    When user click add medical diagnose button
    And user input invalid input for <height>, <weight>, <bloodPres>,<bodyTemp>, <sugarAnal>, <heartRate>,<breatheRate>, <note>
    When user click save button
    And click yes button in the pop up
    Then system verifying condition for <height>, <weight>, <bloodPres>, <sugarAnal>, <bodyTemp>, <HeartRate>,<breatheRate>, <note> and display message error

    Examples: 
      | height | weight | bloodPres | sugarAnal | bodyTemp | heartRate | breatheRate | note     |
      |    176 |     45 | 180/120   |       110 |     38.9 |        80 |          16 | headache |
      |        |     45 | 180/120   |       110 |     38.9 |        80 |          16 | headache |
      |    176 |        | 180/120   |       110 |     38.9 |        80 |          16 | headache |
      |    176 |     45 |           |       110 |     38.9 |        80 |          16 | headache |
      |    176 |     45 | 180/120   |           |     38.9 |        80 |          16 | headache |
      |    176 |     45 | 180/120   |       110 |          |        80 |          16 | headache |
      |    176 |     45 | 180/120   |       110 |     38.9 |           |          16 | headache |
      |    176 |     45 | 180/120   |       110 |     38.9 |        80 |             | headache |
      |    176 |     45 | 180/120   |       110 |     38.9 |        80 |          16 |          |

  @InsertvalidMedicalRecord
  Scenario Outline: Nurse as user want to insert patient medical record
    Given user has successfully sign in as nurse to mediclinic app by input valid  email and password
    When user click patient section
    And user click one from the list patient and click medical record section
    When user click add medical  record button
    And user input valid input for <height>, <weight>, <bloodPres>,<bodyTemp>, <sugarAnal>, <heartRate>,<breatheRate>, <note>
    When user click save button
    And click yes button in the pop up
    Then user will navigated to list record of the patient page

    Examples: 
      | height | weight | bloodPres | sugarAnal | bodyTemp | heartRate | breatheRate | note     |
      |    176 |     45 | 180/120   |       110 |     38.9 |        80 |          16 | headache |

  @InsertinvalidMedicalDiagnose
  Scenario Outline: Doctor as user want to insert Medical Diagnose of a patient with invalid Input
    Given user has successfully sign in as doctor to mediclinic app by input valid  email and password
    When user click patient section
    And user click one from the list patient and click medical diagnose section
    When user click add medical diagnose button
    And user input invalid input for <date>, <diagnose>, <prescription>
    When user click save button
    And click yes button in the pop up
    Then user will navigated to list diagnose of the patient page

    Examples: 
      | date      | diagnose   | prescription     |
      |           | throatache | Paracetamol 50mg |
      | 1/11/2022 |            | Paracetamol 50mg |
      | 1/11/2022 | throatache |                  |

  @InsertvalidMedicalDiagnose
  Scenario Outline: Doctor as user want to insert Medical Diagnose of a patient with valid Input
    Given user has successfully sign in as doctor to mediclinic app by input valid  email and password
    When user click patient section
    And user click one from the list patient and click medical diagnose section
    When user click add medical diagnose button
    And user input valid input for <date>, <diagnose>, <prescription>
    When user click save button
    And click yes button in the pop up
    Then user will navigated to list diagnose of the patient page

    Examples: 
      | date      | diagnose   | prescription     |
      | 1/11/2022 | throatache | Paracetamol 50mg |
