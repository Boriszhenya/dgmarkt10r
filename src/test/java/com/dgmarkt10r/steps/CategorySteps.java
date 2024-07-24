package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.CategoryPage;
import com.dgmarkt10r.pages.HealthAndBeautyPage;
import com.dgmarkt10r.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.dgmarkt10r.context.TestContext.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CategorySteps {

    CategoryPage cp = new CategoryPage();

    @When("the user go to a category")
    public void userGoingToCategory(){
        getWait().until(ExpectedConditions.visibilityOf(cp.titleHealthAndBeauty));
    }
    @And("user checks 4 categories")
    public void checkingOfCategory(){
        assertEquals(4, cp.allElementsInCategory.size());
    }

    @And("user open a category Health & Beauty")
    public void openingPageHealthAndBeauty()  {
        cp.titleHealthAndBeauty.click();
        getWait().until(ExpectedConditions.visibilityOf(cp.titleTextPageHealthBeauty));
        assertEquals("Health & Beauty", cp.titleTextPageHealthBeauty.getText());
    }

    @And("user selecting a filter Headphone")
    public void userSelectingAFilterHeadphone() {
        HealthAndBeautyPage hb = new HealthAndBeautyPage();
        getActions().moveToElement(cp.titleHeadphone).pause(2000).perform();
        getActions().scrollToElement(cp.titleHeadphone).perform();
        cp.titleHeadphone.click();
        assertEquals("Search - Headphone", hb.titleHeadPhonePage.getText());
    }

    @Then("user is a headphone page")
    public void userIsAHeadphonePage() {
        HealthAndBeautyPage hb = new HealthAndBeautyPage();
        getWait().until(ExpectedConditions.visibilityOf(hb.messageOfHeadphonePage));
        assertEquals("There is no product that matches the search criteria.", hb.messageOfHeadphonePage.getText());
    }
}