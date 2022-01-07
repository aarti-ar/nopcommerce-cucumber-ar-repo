package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.BuildYourOwnComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class BuildYourOwnCompSteps {

        @And("^I select processor \"([^\"]*)\"$")
        public void iSelectProcessor(String processor) {
            new BuildYourOwnComputerPage().selectProcessor(processor);
        }

        @And("^I select ram \"([^\"]*)\"$")
        public void iSelectRam(String ram)  {
            new BuildYourOwnComputerPage().selectRAM(ram);
        }

        @And("^I select Hard disk \"([^\"]*)\"$")
        public void iSelectHardDisk(String hdd)  {
            new BuildYourOwnComputerPage().selectHDD(hdd);
        }

        @And("^I select Operating system \"([^\"]*)\"$")
        public void iSelectOperatingSystem(String os)  {
            new BuildYourOwnComputerPage().selectOS(os);
        }

        @And("^I select software \"([^\"]*)\"$")
        public void iSelectSoftware(String soft)  {
            new BuildYourOwnComputerPage().selectSoftware(soft);
        }

        @And("^I click on add to cart tab$")
        public void iClickOnAddToCartTab() {
            new BuildYourOwnComputerPage().clickOnAddToCart();
        }

        @Then("^my built product added to cart$")
        public void myBuiltProductAddedToCart() {
            new BuildYourOwnComputerPage().verifyProductAddedToCart();
        }
    }


