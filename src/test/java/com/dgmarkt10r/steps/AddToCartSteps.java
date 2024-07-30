package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.CategoryPage;
import com.dgmarkt10r.pages.MainPage;
import com.dgmarkt10r.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.dgmarkt10r.context.TestContext.getActions;
import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AddToCartSteps {

    @When("user clicks on television category")
    public void userClicksOnTelevisionCategory() {
        MainPage mainPage = new MainPage();
        getWait().until(ExpectedConditions.visibilityOf(mainPage.linkTVCategory.get(1)));
        mainPage.linkTVCategory.get(1).click();
    }

    @And("moves the cursor over the product image")
    public void movesTheCursorOverTheProductImage() {
        CategoryPage categoryPage = new CategoryPage();
        getWait().until(ExpectedConditions.visibilityOf(categoryPage.productImage));
        getActions().moveToElement(categoryPage.productImage).perform();
    }

    @And("clicks on the add to cart icon")
    public void clicksOnTheAddToCartIcon() {
        CategoryPage categoryPage = new CategoryPage();
        getWait().until(ExpectedConditions.visibilityOf(categoryPage.addToCartIcon.get(3)));
        categoryPage.addToCartIcon.get(3).click();
    }

    @And("clicks on the product image")
    public void clicksOnTheProductImage() {
        CategoryPage categoryPage = new CategoryPage();
        getWait().until(ExpectedConditions.visibilityOf(categoryPage.productImage));
        categoryPage.productImage.click();
    }

    @Then("a message appears indicating that the item was successfully added to the cart")
    public void aMessageAppearsIndicatingThatTheItemWasSuccessfullyAddedToTheCart() {
        CategoryPage categoryPage = new CategoryPage();
        getWait().until(ExpectedConditions.visibilityOf(categoryPage.successMessage));
        assertTrue(categoryPage.successMessage.getText().contains("Success: You have added Cello C4020DVB 40\" LED-backlit LCD TV to your shopping cart!\n" +
                "×"));
    }

    @And("clicks on the add to cart button")
    public void clicksOnTheAddToCartButton() {
        new ProductPage().buttonAddToCart.click();
    }

    @And("the added products amount appeared next to the cart icon at the top of the page")
    public void theAddedProductsAmountAppearedNextToTheCartIconAtTheTopOfThePage() {
        assertEquals("1", new MainPage().cartTotal.getText());
    }
}