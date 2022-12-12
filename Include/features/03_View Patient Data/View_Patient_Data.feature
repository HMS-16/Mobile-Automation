Feature: View Patient Data

  @ViewProfilePatient
  Scenario Outline: User want to view profile patient
    Given user has successfully sign in  to mediclinic app by input valid  <email> and <password>
    When user click patient section
    And click one from the list patient
    Then user can view patient profile

    Examples: 
      | email              | password |
      | abednego@gmail.com | password |
      | natasya@gmail.com  | password |

  @ViewMedicalRecordAsNurse
  Scenario Outline: User want to view patient medical record as nurse
    Given user has successfully sign in as nurse to mediclinic app by input valid  <email> and <password>
    When user click patient section
    And click one from the list patient
    And click medical record section
    Then system verifying that  user can view patient medical record and button add medical record

    Examples: 
      | email             | password |
      | natasya@gmail.com | password |

  @ViewMedicalRecordAsDoctor
  Scenario Outline: User want to view patient medical record as doctor
    Given user has successfully sign in as doctor to mediclinic app by input valid  <email> and <password>
    When user click patient section
    And click one from the list patient
    And click medical record section
    Then system verifying that  user can view patient medical record and there is no button add medical record

    Examples: 
      | email              | password |
      | abednego@gmail.com | password |

  @ViewMedicalDiagnoseAsNurse
  Scenario Outline: User want to view patient medical diagnose as nurse
    Given user has successfully sign in as nurse to mediclinic app by input valid  <email> and <password>
    When user click patient section
    And click one from the list patient
    And click medical diagnose section
    Then system verifying that  user can view patient medical diagnose and there is no button add medical diagnose

    Examples: 
      | email             | password |
      | natasya@gmail.com | password |

  @ViewMedicalDiagnoseAsDoctor
  Scenario Outline: User want to view patient medical diagnose as doctor
    Given user has successfully sign in as nurse to mediclinic app by input valid  <email> and <password>
    When user click patient section
    And click one from the list patient
    And click medical diagnose section
    Then system verifying that  user can view patient medical diagnose and button add medical diagnose

    Examples: 
      | email              | password |
      | abednego@gmail.com | password |
