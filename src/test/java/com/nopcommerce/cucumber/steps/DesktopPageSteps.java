package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.DesktopPage;
import cucumber.api.java.en.And;

public class DesktopPageSteps {
    @And("^I navigate to desktop page successfully$")
    public void iNavigateToDesktopPageSuccessfully() {
        new DesktopPage().verifyDesktopPage("Desktops");
    }

    @And("^I click on build your own computer$")
    public void iClickOnBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYourOwnComputer();
    }
}
