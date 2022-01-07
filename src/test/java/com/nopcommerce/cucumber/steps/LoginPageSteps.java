package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I navigate to login page successfully$")
    public void iNavigateToLoginPageSuccessfully() {
        new LoginPage().verifyWelcomeText();
    }

    @And("^I enter email id \"([^\"]*)\"$")
    public void iEnterEmailId(String email)  {
        new LoginPage().enterEmail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);

    }

    @And("^I click login$")
    public void iClickLogin() {
        new  LoginPage().clickOnLogin();
    }

    @And("^I can see error message$")
    public void iCanSeeErrorMessage() {
        new LoginPage().verifyErrorMessage();
    }

    @And("^I can see logout button$")
    public void iCanSeeLogoutButton() {
        new LoginPage().verifyLogOutOption();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().clickOnlogOutButton();
    }
}
