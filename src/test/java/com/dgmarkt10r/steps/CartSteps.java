package com.dgmarkt10r.steps;

import com.dgmarkt10r.context.CartAndCheckoutFormsData;
import com.dgmarkt10r.pages.CartPage;
import com.dgmarkt10r.pages.CategoryPage;
import com.dgmarkt10r.pages.CheckoutPage;
import com.dgmarkt10r.pages.MainPage;
import com.dgmarkt10r.utils.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static com.dgmarkt10r.context.TestContext.getDriver;
import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CartSteps {

    @When("user changes the number of item quantity on {string}")
    public void userChangesTheNumberOfItemQuantityOn(String numberOfItem) {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.fieldOfQuantity));
        cartPage.fieldOfQuantity.click();
        cartPage.fieldOfQuantity.sendKeys(Keys.BACK_SPACE);
        cartPage.fieldOfQuantity.sendKeys(numberOfItem);
    }

    @And("clicks on the update button")
    public void clicksOnTheUpdateButton() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.updateButton));
        cartPage.updateButton.click();
    }

    @Then("the total price of items changed to {string}")
    public void theTotalPriceOfItemsChangedTo(String totalPrice) {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.totalPrice));
        assertEquals(totalPrice, cartPage.totalPrice.getText());
    }

    @And("a success message appears on the page")
    public void aSuccessMessageAppearsOnThePage() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.successUpdateMessage));
        assertTrue(cartPage.successUpdateMessage.getText().contains("Success: You have modified your shopping cart!\n" +
                "×"));
    }

    @When("user clicks on the remove item button")
    public void userClicksOnTheRemoveItemButton() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.removeItemButton));
        cartPage.removeItemButton.click();
    }

    @Then("a message {string} appears on the page")
    public void aMessageAppearsOnThePage(String message) {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.emptyCartMessage));
        assertEquals(message, cartPage.emptyCartMessage.getText());
    }

    @And("price changed to {string}")
    public void priceChangedTo(String lastPrice) {
        assertEquals(lastPrice, new CartPage().priceWithDiscount.getLast().getText());
    }

    @When("user clicks on the coupon link")
    public void userClicksOnTheCouponLink() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.couponLink));
        cartPage.couponLink.click();
    }

    @And("inputs coupon code")
    public void inputsCouponCode() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.couponInput));
        cartPage.couponInput.click();
        cartPage.couponInput.sendKeys("2222");
        cartPage.couponInput.sendKeys(Keys.ENTER);
    }

    @And("clicks on apply coupon button")
    public void clicksOnApplyCouponButton() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.applyCouponButton));
        cartPage.applyCouponButton.click();
    }

    @Then("a new message appears on the page")
    public void aNewMessageAppearsOnThePage() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.applyCouponMessage));
        assertTrue(cartPage.applyCouponMessage.getText().contains("Success: Your coupon discount has been applied!\n" +
                "×"));
    }

    @And("clicks on the cart link in success message")
    public void clicksOnTheCartLinkInSuccessMessage() {
        CategoryPage categoryPage = new CategoryPage();
        getWait().until(ExpectedConditions.visibilityOf(categoryPage.successMessage));
        categoryPage.linkToCart.click();
    }

    @When("user clicks on the gift certificate link")
    public void userClicksOnTheGiftCertificateLink() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.giftCertificateLink));
        cartPage.giftCertificateLink.click();
    }

    @And("inputs certificate code")
    public void inputsCertificateCode() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.giftCertificateInput));
        cartPage.giftCertificateInput.click();
        cartPage.giftCertificateInput.sendKeys("GIFT20");
    }

    @And("clicks on apply certificate button")
    public void clicksOnApplyCertificateButton() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.applyGiftCertificate));
        cartPage.applyGiftCertificate.click();
    }

    @Then("a new message about gift certificate applying appears on the page")
    public void aNewMessageAboutGiftCertificateApplyingAppearsOnThePage() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.applyCouponMessage));
        assertTrue(cartPage.applyCouponMessage.getText().contains("Success: Your gift certificate discount has been applied!\n" +
                "×"));
    }

    @When("user clicks on the continue shopping button")
    public void userClicksOnTheContinueShoppingButton() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.continueShoppingButton));
        cartPage.continueShoppingButton.click();
    }

    @And("closes a subscribe window")
    public void closesASubscribeWindow() {
        new MainPage().closeSubscribeWindow();
    }

    @Then("user transfers to the main page")
    public void userTransfersToTheMainPage() {
        assertEquals(ConfigurationReader.get("base_url"), getDriver().getCurrentUrl());
    }

    @When("user clicks on the estimate shipping link")
    public void userClicksOnTheEstimateShippingLink() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.estimateShippingLink));
        cartPage.estimateShippingLink.click();
    }

    @And("chooses a country and a region")
    public void choosesACountryAndARegion() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.selectCountry));
        Select select = new Select(cartPage.selectCountry);
        cartPage.selectCountry.click();
        select.selectByVisibleText(new CartAndCheckoutFormsData().getCountry());
        cartPage.selectRegion.click();
        cartPage.selectRegion.sendKeys(new CartAndCheckoutFormsData().getRegion());
    }

    @And("inputs a post code")
    public void inputsAPostCode() {
        CartPage cartPage = new CartPage();
        cartPage.postCodeInput.click();
        cartPage.postCodeInput.sendKeys(new CartAndCheckoutFormsData().getPostCode());
    }

    @And("clicks on get quotes button")
    public void clicksOnGetQuotesButton() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.getQuotesButton));
        cartPage.getQuotesButton.click();
    }

    @And("chooses flat rate")
    public void choosesFlatRate() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.flatRate));
        cartPage.flatRate.click();
    }

    @And("clicks on the shipping estimate apply button")
    public void clicksOnTheShippingEstimateApplyButton() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.applyShippingButton));
        cartPage.applyShippingButton.click();
    }

    @Then("a new message about shipping estimate applying appears on the page")
    public void aNewMessageAboutShippingEstimateApplyingAppearsOnThePage() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.applyShippingEstimateMessage));
        assertTrue(cartPage.applyShippingEstimateMessage.getText().contains("Success: Your shipping estimate has been applied!\n" +
                "×"));
    }

    @Then("user transfers to the checkout page")
    public void userTransfersToTheCheckoutPage() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.checkout));
        assertEquals("Checkout", checkoutPage.checkout.getText());
    }

    @Then("the confirm order button is displayed")
    public void theConfirmOrderButtonIsDisplayed() {
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.confirmOrderButton));
        assertTrue(checkoutPage.confirmOrderButton.isDisplayed());
    }

    @When("user clicks on the checkout button from cart")
    public void userClicksOnTheCheckoutButtonFromCart() {
        CartPage cartPage = new CartPage();
        getWait().until(ExpectedConditions.visibilityOf(cartPage.checkoutButtonFromCart));
        cartPage.checkoutButtonFromCart.click();
    }
}

