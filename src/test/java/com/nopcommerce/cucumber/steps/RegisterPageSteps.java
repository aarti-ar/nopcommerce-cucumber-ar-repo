package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class RegisterPageSteps {
    @Then("^I navigated to register page$")
    public void iNavigatedToRegisterPage() {
        new RegisterPage().verifyRegisterText();
    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I got an error First name is required$")
    public void iGotAnErrorFirstNameIsRequired() {
        new RegisterPage().verifyTheErrorMessageFirstNameIsRequired();
    }

    @And("^I got an error Last name is required$")
    public void iGotAnErrorLastNameIsRequired() {
        new RegisterPage().verifyTheErrorMessageLastNameIsRequired();
    }

    @And("^I got an error email is required$")
    public void iGotAnErrorEmailIsRequired() {
        new RegisterPage().verifyTheErrorMessageEmailIsRequired();
    }

    @And("^I got an error password is required$")
    public void iGotAnErrorPasswordIsRequired() {
        new RegisterPage().verifyTheErrorMessagePasswordIsRequired();
    }

    @And("^I got an error confirm password is required$")
    public void iGotAnErrorConfirmPasswordIsRequired() {
        new RegisterPage().verifyTheErrorMessageForConfirmPasswordIsRequired();
    }

    @And("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String gen) {
        new RegisterPage().selectGender(gen);
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String name) {
        new RegisterPage().enterFirstName(name);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String last) {
        new RegisterPage().enterLastName(last);
    }

    @And("^I select birthday \"([^\"]*)\"$")
    public void iSelectBirthday(String day) {
        new RegisterPage().selectBirthDay(day);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String mail) {
        new RegisterPage().enterEmail(mail);
    }

    @And("^I enter pass  \"([^\"]*)\"$")
    public void iEnterPass(String pass) {
        new RegisterPage().enterPassword(pass);
    }

    @And("^I enter confirm pass  \"([^\"]*)\"$")
    public void iEnterConfirmPass(String cpass) {
        new RegisterPage().enterConfirmPassword(cpass);
    }

    @And("^I select birthday month \"([^\"]*)\"$")
    public void iSelectBirthdayMonth(String month) {
        new RegisterPage().selectBirthMonth(month);
    }

    @And("^I select birthday year\"([^\"]*)\"$")
    public void iSelectBirthdayYear(String year) {
        new RegisterPage().selectBirthYear(year);
    }


    @And("^I can see registration complete$")
    public void iCanSeeRegistrationComplete() {
        new RegisterPage().verifyRegisterText();
    }
}
