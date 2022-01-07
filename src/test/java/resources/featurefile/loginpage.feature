Feature: NopCommerce Login
  As a user I should login in nopcommerce website

  Background: I am on homepage

  @smoke
  Scenario: User should navigate to login page successfully
    When I click on login link
    Then I navigate to login page successfully

  @smoke
  Scenario:  verify The Error Message With InValid Credentials
    When I click on login link
    And  I enter email id "prime123@gmail.com"
    And  I enter password "123456"
    And  I click login
    And I can see error message

  @sanity
  Scenario: verify user should login successfully with valid credentials
    When I click on login link
    And  I enter email id "primeQA01@gmail.com"
    And  I enter password "Prime@9988"
#    And  I enter email id "boston123@gmail.com" use this invalid email and pw to make test fail
#    And  I enter password "9121995"
    And  I click login
    And I can see logout button

  @sanity,@regression
  Scenario: verify user should logout successfully
    When I click on login link
    And  I enter email id "primeQA01@gmail.com"
    And  I enter password "Prime@9988"
    #    And  I enter email id "boston123@gmail.com" use this invalid email and pw to make test fail
#    And  I enter password "9121995"
    And  I click login
    And  I click on logout button
