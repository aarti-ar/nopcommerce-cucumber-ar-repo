package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.ComputerPage;
import cucumber.api.java.en.Then;

public class ComputerPageSteps {
    @Then("^I navigated computer page successfully$")
    public void iNavigatedComputerPageSuccessfully() {
        new ComputerPage().verifyComputerPage("Computers");
    }

    @Then("^I click on desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }
}
