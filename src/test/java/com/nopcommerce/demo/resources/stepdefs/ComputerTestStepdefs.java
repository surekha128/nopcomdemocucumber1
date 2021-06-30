package com.nopcommerce.demo.resources.stepdefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerTestStepdefs {


    @And("^I click on <Computers>$")
    public void iClickOnComputers() {
        new ComputerPage().clickonComputer();
    }

    @And("^I click on <Desktop>$")
    public void iClickOnDesktop() {
        new ComputerPage().clickonDesktop();
    }

    @When("^click on <sortby> position select \"([^\"]*)\"$")
    public void clickOnSortbyPositionSelect(String sortby) throws Throwable {
        new DesktopPage().mousehoveronsortby();
    }

    @Then("^The Product will arrange in Descending order verify$")
    public void theProductWillArrangeInDescendingOrderVerify() {
        new DesktopPage().ProductwillarrangeinDescendingorder();
    }
}
