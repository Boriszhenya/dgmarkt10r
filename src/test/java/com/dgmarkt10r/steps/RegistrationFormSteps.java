package com.dgmarkt10r.steps;

import com.dgmarkt10r.context.NewUser;
import com.dgmarkt10r.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.dgmarkt10r.context.TestContext.getActions;
import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationFormSteps {

    @When("the user enters in the Password field {string}")
    public void theUserEntersInThePasswordField(String valueInvalidPassword) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().fieldPasswordRegistrationForm));
        new RegisterAccountForm().fieldPasswordRegistrationForm.sendKeys(valueInvalidPassword);
    }

    @And("press the Continue button")
    public void pressTheContinueButton() {
        new RegisterAccountForm().buttonContinueRegistrationForm.click();
    }

    @Then("the message under the password field {string}")
    public void theMessageUnderThePasswordField(String messageError) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().messageErrorFieldPasswordRegistrationForm));
        assertEquals(messageError, new RegisterAccountForm().messageErrorFieldPasswordRegistrationForm.getText());
    }

    @When("a user clicks on the heart icon")
    public void aUserClicksOnTheHeartIcon() {
        new MainPage().headerWishListIcon.click();
    }

    @And("clicks the Continue button on the New Customer form")
    public void clicksTheContinueButtonOnTheNewCustomerForm() {
        getWait().until(ExpectedConditions.visibilityOf(new AccountLoginPage().buttonContinueLoginPage));
        new AccountLoginPage().buttonContinueLoginPage.click();
    }

    @Then("the new user registration form {string} opens")
    public void theNewUserRegistrationFormOpens(String tittle) {
        assertEquals(tittle, new AccountRegistrationPage().titlesAccountRegistrationPage.getText());
    }

    @When("the user clicks the My Account link in the footer")
    public void theUserClicksTheMyAccountLinkInTheFooter() {
        MainPage mainPage = new MainPage();
        getActions().moveToElement(mainPage.footerMyAccount);
        mainPage.footerMyAccount.click();
    }

    @When("the user enters in the Telephone field {string}")
    public void theUserEntersInTheTelephoneField(String valueInvalidTelephone) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().fieldTelephoneRegistrationForm));
        new RegisterAccountForm().fieldTelephoneRegistrationForm.sendKeys(valueInvalidTelephone);
    }

    @Then("the message under the Telephone field {string}")
    public void theMessageUnderTheTelephoneField(String messageError) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().messageErrorFieldTelephoneRegistrationForm));
        assertEquals(messageError, new RegisterAccountForm().messageErrorFieldTelephoneRegistrationForm.getText());
    }

    @When("the user enters in the E-Mail field {string}")
    public void theUserEntersInTheEMailField(String valueInvalidEMail) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().fieldEMailRegistrationForm));
        new RegisterAccountForm().fieldEMailRegistrationForm.sendKeys(valueInvalidEMail);
    }

    @Then("the message under the E-Mail field {string}")
    public void theMessageUnderTheEMailField(String messageError) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().messageErrorFieldEMailRegistrationForm));
        assertEquals(messageError, new RegisterAccountForm().messageErrorFieldEMailRegistrationForm.getText());
    }

    @When("the user enters in the First Name field {string}")
    public void theUserEntersInTheFirstNameField(String valueInvalidFirstName) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().fieldFirstNameRegistrationForm));
        new RegisterAccountForm().fieldFirstNameRegistrationForm.sendKeys(valueInvalidFirstName);
    }

    @Then("the message under the First Name field {string}")
    public void theMessageUnderTheFirstNameField(String messageError) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().messageErrorFieldFirstNameRegistrationForm));
        assertEquals(messageError, new RegisterAccountForm().messageErrorFieldFirstNameRegistrationForm.getText());
    }

    @When("the user enters in the Last Name field {string}")
    public void theUserEntersInTheLastNameField(String valueInvalidLastName) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().fieldLastNameRegistrationForm));
        new RegisterAccountForm().fieldLastNameRegistrationForm.sendKeys(valueInvalidLastName);
    }

    @Then("the message under the Last Name field {string}")
    public void theMessageUnderTheLastNameField(String messageError) {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().messageErrorFieldLastNameRegistrationForm));
        assertEquals(messageError, new RegisterAccountForm().messageErrorFieldLastNameRegistrationForm.getText());
    }

    @And("fills in all fields of the registration form with valid data")
    public void fillsInAllFieldsOfTheRegistrationFormWithValidData() {
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().fieldPasswordConfirmRegistrationForm));
        NewUser user = new NewUser();
        RegisterAccountForm registerAccountForm = new RegisterAccountForm();
        registerAccountForm.fieldFirstNameRegistrationForm.sendKeys(user.firstName);
        registerAccountForm.fieldLastNameRegistrationForm.sendKeys(user.lastName);
        registerAccountForm.fieldEMailRegistrationForm.sendKeys(user.email);
        registerAccountForm.fieldTelephoneRegistrationForm.sendKeys(user.telephone);
        registerAccountForm.fieldPasswordRegistrationForm.sendKeys(user.password);
        registerAccountForm.fieldPasswordConfirmRegistrationForm.sendKeys(user.password);
        registerAccountForm.checkboxPrivacyPolicyRegistrationForm.click();
    }

    @Then("clicking on the Continue button brings up a window that says {string}")
    public void clickingOnTheContinueButtonBringsUpAWindowThatSays(String message) {
        new RegisterAccountForm().buttonContinueRegistrationForm.click();
        getWait().until(ExpectedConditions.visibilityOf(new RegisterAccountForm().titleRegistrationConfirmationWindowRegistrationForm));
        assertEquals(message, new RegisterAccountForm().titleRegistrationConfirmationWindowRegistrationForm.getText());
    }
}