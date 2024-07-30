package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.RegisterAccountForm;
import com.dgmarkt10r.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseSteps {

    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.enteringStandardLoginAndPassword();
//        mainPage.closeSubscribeWindow();
    }

    @When("the user goes to the My account menu")
    public void theUserGoesToTheMyAccountMenu() {
        new MainPage().headerMyAccountLink.click();
    }

    @And("goes to the Register tab")
    public void goesToTheRegisterTab() {
        new MainPage().headerMyAccountRegisterLink.click();
    }

    @Then("the {string} form has been opened")
    public void theFormHasBeenOpened(String textTitle) {
        assertEquals(textTitle, new RegisterAccountForm().getTextTitle());
    }
}