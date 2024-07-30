package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.CartPage;
import com.dgmarkt10r.pages.DropDownMenuPage;
import com.dgmarkt10r.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropDownMenuSteps {

    @When("user clicks on the cart icon in the upper right corner of the page")
    public void userClicksOnTheCartIconInTheUpperRightCornerOfThePage() {
        MainPage mainPage = new MainPage();
        getWait().until(ExpectedConditions.visibilityOf(mainPage.cartIcon));
        mainPage.cartIcon.click();
    }

    @And("clicks on the remove button")
    public void clicksOnTheRemoveButton() {
        DropDownMenuPage dropDownMenuPage = new DropDownMenuPage();
        getWait().until(ExpectedConditions.visibilityOf(dropDownMenuPage.buttonCartRemove));
        dropDownMenuPage.buttonCartRemove.click();
    }

    @Then("the number of products in the upper right corner of the page next to the cart icon are {string}")
    public void theNumberOfProductsInTheUpperRightCornerOfThePageNextToTheCartIconAre(String number) {
        MainPage mainPage = new MainPage();
        getWait().until(ExpectedConditions.textToBePresentInElement(mainPage.cartTotal, "0"));
        assertEquals(number, mainPage.cartTotal.getText());
    }

    @When("user clicks on the view cart button")
    public void userClicksOnTheViewCartButton() {
        DropDownMenuPage dropDownMenuPage = new DropDownMenuPage();
        getWait().until(ExpectedConditions.visibilityOf(dropDownMenuPage.viewCartButton));
        dropDownMenuPage.viewCartButton.click();
    }

    @Then("user transfers to the cart page")
    public void userTransfersToTheCartPage() {
        assertEquals("Shopping Cart  (0.12kg)", new CartPage().shoppingCartTitle.getText());
    }

    @When("user clicks on the checkout button from drop down menu")
    public void userClicksOnTheCheckoutButtonFromDropDownMenu() {
        DropDownMenuPage dropDownMenuPage = new DropDownMenuPage();
        getWait().until(ExpectedConditions.visibilityOf(dropDownMenuPage.checkoutButtonFromDropDownMenu));
        dropDownMenuPage.checkoutButtonFromDropDownMenu.click();
    }
}

