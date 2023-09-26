
  Feature: User could create new account
@smoke
    Scenario: user could create new account with valid data

      Given user go to register page
      When user select gender
      And user enter "Mohamed" & "Desouki"
      And user select date of birth
      And user enter email
      And user enter "12345gh" password
      And user click on register button
      Then account is created successfully



