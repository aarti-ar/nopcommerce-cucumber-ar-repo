package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.HomePage;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }
}
