$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computerpage.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Page",
  "description": "",
  "id": "computer-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10932815000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify user should navigate to computer page successfully",
  "description": "",
  "id": "computer-page;verify-user-should-navigate-to-computer-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I click on computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I navigated computer page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iClickOnComputerTab()"
});
formatter.result({
  "duration": 1255202700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iNavigatedComputerPageSuccessfully()"
});
formatter.result({
  "duration": 234102500,
  "status": "passed"
});
formatter.after({
  "duration": 1124251800,
  "status": "passed"
});
formatter.uri("loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "NopCommerce Login",
  "description": "As a user I should login in nopcommerce website",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4234517800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "nopcommerce-login;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I navigate to login page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1459138100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iNavigateToLoginPageSuccessfully()"
});
formatter.result({
  "duration": 79927500,
  "status": "passed"
});
formatter.after({
  "duration": 819064200,
  "status": "passed"
});
formatter.before({
  "duration": 4982218400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 12,
  "name": "verify The Error Message With InValid Credentials",
  "description": "",
  "id": "nopcommerce-login;verify-the-error-message-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter email id \"prime123@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter password \"123456\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click login",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I can see error message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1502538600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prime123@gmail.com",
      "offset": 18
    }
  ],
  "location": "LoginPageSteps.iEnterEmailId(String)"
});
formatter.result({
  "duration": 231094200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 18
    }
  ],
  "location": "LoginPageSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 216114800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickLogin()"
});
formatter.result({
  "duration": 1263424200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iCanSeeErrorMessage()"
});
formatter.result({
  "duration": 62833500,
  "status": "passed"
});
formatter.after({
  "duration": 778922800,
  "status": "passed"
});
formatter.uri("registerpage.feature");
formatter.feature({
  "line": 1,
  "name": "Register Page Functionality",
  "description": "",
  "id": "register-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4186120700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "I am on home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "verify user should navigate to register page successfully",
  "description": "",
  "id": "register-page-functionality;verify-user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I navigated to register page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1543536800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iNavigatedToRegisterPage()"
});
formatter.result({
  "duration": 66802000,
  "status": "passed"
});
formatter.after({
  "duration": 871568000,
  "status": "passed"
});
formatter.before({
  "duration": 4457986600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "I am on home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 11,
  "name": "verify that firstname lastname email password confirm password are required",
  "description": "",
  "id": "register-page-functionality;verify-that-firstname-lastname-email-password-confirm-password-are-required",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 10,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I got an error First name is required",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I got an error Last name is required",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I got an error email is required",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I got an error password is required",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I got an error confirm password is required",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1559989700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 290192600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iGotAnErrorFirstNameIsRequired()"
});
formatter.result({
  "duration": 97408400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iGotAnErrorLastNameIsRequired()"
});
formatter.result({
  "duration": 78853900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iGotAnErrorEmailIsRequired()"
});
formatter.result({
  "duration": 73869900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iGotAnErrorPasswordIsRequired()"
});
formatter.result({
  "duration": 93949600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iGotAnErrorConfirmPasswordIsRequired()"
});
formatter.result({
  "duration": 72584500,
  "status": "passed"
});
formatter.after({
  "duration": 1109571200,
  "status": "passed"
});
});