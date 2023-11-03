Feature: To Register and Login

  Scenario: Register into the parabank
    Given user is on parabank page
    When user clicks on register link
    And user enters the firstname
    And user enters the lastname
    And user enter the address
    And user enter the city
    And user enter the state
    And user enter the zipcode
    And user enter the phone
    And user enter the ssn
    And user enter the username
    And user enter the password
    And user enter the confirmpassword
    And user clicks register

  #Then user gets confirmation messege
  Scenario Outline: login with correct user id and pass
    Given user is on webpage "https://parabank.parasoft.com/parabank/index.htm"
    When user give id "<name>"
    And user give pass "<pass>"
    Then click log

    Examples: 
      | name | pass    |
      | xxx  |  123456 |
      | sgsg | sgsgshg |
      | xxx  | agehhae |
      |      |         |
