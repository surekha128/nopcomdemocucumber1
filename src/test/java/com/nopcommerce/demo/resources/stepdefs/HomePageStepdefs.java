package com.nopcommerce.demo.resources.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageStepdefs {
    // HomePage homePage = new HomePage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String menu) throws Throwable {
       new HomePage().getHomePage(menu);
    }

    @Then("^I should navigate Computers successfully \"([^\"]*)\"$")
    public void iShouldNavigateComputersSuccessfully(String arg0) throws Throwable {
        new HomePage().getActualResult();
    }


    @Then("^I should navigate Electonics  Successfully \"([^\"]*)\"$")
    public void iShouldNavigateElectonicsSuccessfully(String verify) throws Throwable {
       new HomePage().getActualResult();
    }


    @Then("^I should navigate Apparel Successfully \"([^\"]*)\"$")
    public void iShouldNavigateApparelSuccessfully(String verify) throws Throwable {
        new HomePage().getActualResult();
    }

    @Then("^I should navigate \"([^\"]*)\" Successfully$")
    public void iShouldNavigateSuccessfully(String verify) throws Throwable {
       new HomePage().getActualResult();
    }


}




