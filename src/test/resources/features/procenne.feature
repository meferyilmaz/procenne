Feature: Procenne communication
  As a user, I should fill in the blanks in the contact tab

  @procenne
  Scenario: User needs to create a request
    Given User is on the procenne contact tab
    When User fills in the blanks
    Then User should see results
