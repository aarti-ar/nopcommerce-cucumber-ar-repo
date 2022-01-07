Feature: Register Page Functionality

  Background: I am on home page

  @smoke
  Scenario: verify user should navigate to register page successfully
    When I click on register link
    Then I navigated to register page

  @smoke @sanity
  Scenario: verify that firstname lastname email password confirm password are required
    When I click on register link
    Then I click on register button
    And I got an error First name is required
    And I got an error Last name is required
    And I got an error email is required
    And I got an error password is required
    And I got an error confirm password is required

  @sanity
  Scenario Outline: verify user can register successfully
    When I click on register link
    And I select gender "<gen>"
    And I enter firstname "<name>"
    And I enter lastname "<lastname>"
    And I select birthday "<day>"
    And I select birthday month "<mon>"
    And I select birthday year"<year>"
    And I enter email "<email>"
    And I enter pass  "<pass>"
    And I enter confirm pass  "<cpass>"
    Then I click on register button
    And I can see registration complete

    Examples:
      | gen  | name   | lastname | day | mon | year | email               | pass       | cpass      |
      | male | Krishna | Patel    | 9   | 12  | 1995 | primeQA01@gmail.com | Prime@9988 | Prime@9988 |


