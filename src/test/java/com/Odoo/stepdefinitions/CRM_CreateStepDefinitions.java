package com.Odoo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CRM_CreateStepDefinitions {

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        System.out.println("I am on login page!");
    }

    @Then("user logs as an events crmManager")
    public void userLogsAsAnEventsCrmManager() {
        System.out.println("Login as an events crmManager");
    }

    @And("user verifies that {string} button is clickable")
    public void userVerifiesThatButtonIsClickable(String string) {
        System.out.println("Verifying that "+ string+ " button is clickable");
    }

    @And("user should be able to crate a opportunity")
    public void userShouldBeAbleToCrateAOpportunity() {

    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }

    @Then("user logs in as events CRM manager")
    public void userLogsInAsEventsCRMManager() {
    }

    @And("user verifies that {string} page subtitle is displayed")
    public void userVerifiesThatPageSubtitleIsDisplayed(String arg0) {
    }
}
