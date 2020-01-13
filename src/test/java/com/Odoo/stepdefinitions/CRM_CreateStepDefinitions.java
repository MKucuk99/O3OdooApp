package com.Odoo.stepdefinitions;

import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CRM_CreateStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        System.out.println("I am on login page!");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().window().maximize();
    }

    @Then("user logs as an events {string}")
    public void user_logs_as_an_events(String string) {
        loginPage.login(string);
        loginPage.waitUntilLoadingCompleted();
        System.out.println("Login as " + string);
    }

    @And("user verifies that {string} button is clickable")
    public void userVerifiesThatButtonIsClickable(String string) {
        System.out.println("Verifying that " + string + " button is clickable");
    }

    @And("user should be able to crate a opportunity")
    public void userShouldBeAbleToCrateAOpportunity() {

    }

    @Then("user navigates to {string} module")
    public void userNavigatesToModule(String moduleName) {
        loginPage.navigateToModule(moduleName);
    }
/*
********** needs to be checked  *****************
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }

    @Then("user logs in as events CRM manager")
    public void userLogsInAsEventsCRMManager() {
    }

    @And("user verifies that {string} page subtitle is displayed")
    public void userVerifiesThatPageSubtitleIsDisplayed(String arg0) {
    }

 */
}
