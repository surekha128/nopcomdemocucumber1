package com.nopcommerce.demo.resources.stepdefs;

import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsortbyAtoZ;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuildStepdefs {

    @And("^I click on <Desktop> link$")
    public void iClickOnDesktopLink() {

        new ComputerPage().clickonDesktop();
    }
    @And("^I click on <sortby> position select \"([^\"]*)\"$")
    public void iClickOnSortbyPositionSelect(String arg0) throws Throwable {
       new DesktopsortbyAtoZ().getsortingpositionNameAtoZ();
    }

    @And("^verify text \"([^\"]*)\"$")
    public void verifyText() throws Throwable {
        new BuildYourOwnComputer().getAbuildtext();
    }

    @And("^select processor \"([^\"]*)\"$")
    public void selectProcessor() throws Throwable {
        new BuildYourOwnComputer().buildyourowncomputerproductselectprocessor("2");
    }

    @And("^select ram \"([^\"]*)\"$")
    public void selectRam() throws Throwable {
       new BuildYourOwnComputer().buildyourowncomputerproductselectram("4");
    }

    @And("^select HDD radio \"([^\"]*)\"$")
    public void selectHDDRadio() throws Throwable {
       new BuildYourOwnComputer().buildyourowncomputerproductselectHDD("7");
    }

    @And("^Select OS radio \"([^\"]*)\"$")
    public void selectOSRadio() throws Throwable {
       new BuildYourOwnComputer().selectOS("9");
    }

    @And("^check two check boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void checkTwoCheckBoxesAnd() throws Throwable {
       new BuildYourOwnComputer().selectSoftware("12");
    }

    @And("^verify price$")
    public void verifyPrice() {
        new BuildYourOwnComputer().gettotalPrice();
    }

    @And("^click on \"([^\"]*)\"$")
    public void clickOnAddToCart() throws Throwable {
       new BuildYourOwnComputer().clickoOnADDTOCARD();
    }

    @Then("^verify message \"([^\"]*)\"$")
    public void verifyMessage() throws Throwable {
       new BuildYourOwnComputer().productAddedSuccessfully();
    }


    @When("^Click Build your own computer \"([^\"]*)\"$")
    public void clickBuildYourOwnComputer(String arg0) throws Throwable {
        new BuildYourOwnComputer().addtocartclick();
    }
}
