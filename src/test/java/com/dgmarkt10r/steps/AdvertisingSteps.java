package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdvertisingSteps {

    @Then("a button read more has appeared")
    public void aButtonReadMoreHasAppeared() {
        assertTrue(new MainPage().readmoreButton.isDisplayed());
    }

    @When("user waits when button read more appears")
    public void userWaitsWhenButtonReadMoreAppears() {
        getWait().until(ExpectedConditions.visibilityOf(new MainPage().readmoreButton));
    }
}
