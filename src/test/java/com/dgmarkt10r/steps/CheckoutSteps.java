package com.dgmarkt10r.steps;

import com.dgmarkt10r.context.CartAndCheckoutFormsData;
import com.dgmarkt10r.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutSteps {

    @When("user writes a comment {string} in the field")
    public void userWritesACommentInTheField(String comment) {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.deliveryMethodComment));
        checkoutPage.deliveryMethodComment.click();
        checkoutPage.deliveryMethodComment.sendKeys(comment);
    }

    @And("clicks on the continue button from delivery method")
    public void clicksOnTheContinueButtonFromDeliveryMethod() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.deliveryMethodContinueButton));
        checkoutPage.deliveryMethodContinueButton.click();
    }

    @Then("a payment method form appears")
    public void aPaymentMethodFormAppears() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.paymentMethodChecked));
        assertTrue(checkoutPage.paymentMethodChecked.isSelected());
    }

    @When("user clicks on checkbox to agree with terms")
    public void userClicksOnCheckboxToAgreeWithTerms() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.paymentMethodTermAgreeCheckbox));
        checkoutPage.paymentMethodTermAgreeCheckbox.click();
    }

    @And("clicks on the continue button from payment method")
    public void clicksOnTheContinueButtonFromPaymentMethod() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.paymentMethodContinueButton));
        checkoutPage.paymentMethodContinueButton.click();
    }

    @When("user clicks on the confirm order button")
    public void userClicksOnTheConfirmOrderButton() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.confirmOrderButton));
        checkoutPage.confirmOrderButton.click();
    }

    @Then("the total price of items is {string}")
    public void theTotalPriceOfItemsIs(String totalPrice) {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.totalPriceGuest));
        assertEquals(totalPrice, checkoutPage.totalPriceGuest.getText());
    }

    @Then("a new message {string} appears on the page")
    public void aNewMessageAppearsOnThePage(String success) {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.textToBePresentInElement(checkoutPage.checkoutSuccessMessage, success));
        assertEquals(success, checkoutPage.checkoutSuccessMessage.getText());
    }

    @And("user clicks on the guest checkout button")
    public void userClicksOnTheGuestCheckoutButton() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.guestCheckoutButton));
        checkoutPage.guestCheckoutButton.click();
    }

    @And("user clicks on the continue button in checkout options")
    public void userClicksOnTheContinueButtonInCheckoutOptions() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.guestCheckoutContinueButton));
        checkoutPage.guestCheckoutContinueButton.click();
    }

    @And("user inputs personal details and address")
    public void userInputsPersonalDetailsAndAddress() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.firstNameInput));
        checkoutPage.firstNameInput.click();
        checkoutPage.firstNameInput.sendKeys(new CartAndCheckoutFormsData().getFirstName());
        checkoutPage.lastNameInput.click();
        checkoutPage.lastNameInput.sendKeys(new CartAndCheckoutFormsData().getLastName());
        checkoutPage.emailInput.click();
        checkoutPage.emailInput.sendKeys(new CartAndCheckoutFormsData().getEmail());
        checkoutPage.telephoneInput.click();
        checkoutPage.telephoneInput.sendKeys(new CartAndCheckoutFormsData().getTelephone());
        checkoutPage.addressInput.click();
        checkoutPage.addressInput.sendKeys(new CartAndCheckoutFormsData().getAddress());
        checkoutPage.cityInput.click();
        checkoutPage.cityInput.sendKeys(new CartAndCheckoutFormsData().getCity());
        checkoutPage.postCodeInput.click();
        checkoutPage.postCodeInput.sendKeys(new CartAndCheckoutFormsData().getPostCode());
        Select select = new Select(checkoutPage.countrySelectGuest);
        checkoutPage.countrySelectGuest.click();
        select.selectByVisibleText(new CartAndCheckoutFormsData().getCountry());
        checkoutPage.regionSelectGuest.click();
        checkoutPage.regionSelectGuest.sendKeys(new CartAndCheckoutFormsData().getRegion());
    }

    @And("clicks on the continue button")
    public void clicksOnTheContinueButton() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.guestBillingContinueButton));
        checkoutPage.guestBillingContinueButton.click();
    }

    @Then("a legend {string} appears")
    public void aLegendAppears(String legend) {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.legend));
        assertEquals(legend, checkoutPage.legend.getText());
    }

    @Then("a text {string} appears")
    public void aTextAppears(String text) {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.textDeliveryMethod));
        assertEquals(text, checkoutPage.textDeliveryMethod.getText());
    }
}
