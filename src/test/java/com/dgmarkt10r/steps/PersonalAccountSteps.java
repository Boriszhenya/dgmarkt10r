package com.dgmarkt10r.steps;

import com.dgmarkt10r.context.Address;
import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.accountformpages.*;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static com.dgmarkt10r.context.TestContext.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalAccountSteps {

    @And("goes to the Address Book")
    public void goesToTheAddressBook() {
        new AccountPage().tableLinksRightComponent.linkAddressBookRightTable.click();
    }

    @And("go to New Address")
    public void goToNewAddress() {
        new AddressBookAccountPage().buttonNewAddressBookPage.click();
    }

    @DataTableType
    public Address addressEntryTransformer(Map<String, String> row) {
        return new Address(
                row.get("firstName"),
                row.get("lastName"),
                row.get("company"),
                row.get("address1"),
                row.get("address2"),
                row.get("city"),
                row.get("postCode"),
                row.get("country"),
                row.get("regionState")
        );
    }

    @And("fills in the fields with valid data")
    public void fillsInTheFieldsWithValidData(List<Address> addresses) {
        EditAddressAccountPage editAddressAccountPage = new EditAddressAccountPage();
        editAddressAccountPage.fieldFirstNameEditAddressPage.sendKeys(addresses.getFirst().firstName);
        editAddressAccountPage.fieldLastNameEditAddressPage.sendKeys(addresses.getFirst().lastName);
        editAddressAccountPage.fieldCompanyEditAddressPage.sendKeys(addresses.getFirst().company);
        editAddressAccountPage.fieldAddress1EditAddressPage.sendKeys(addresses.getFirst().address1);
        editAddressAccountPage.fieldAddress2EditAddressPage.sendKeys(addresses.getFirst().address2);
        editAddressAccountPage.fieldCityEditAddressPage.sendKeys(addresses.getFirst().city);
        editAddressAccountPage.fieldPostCodeEditAddressPage.sendKeys(addresses.getFirst().postCode);
        editAddressAccountPage.fieldCountryEditAddressPage.click();
        editAddressAccountPage.fieldCountryEditAddressPage.sendKeys(addresses.getFirst().country);
        editAddressAccountPage.fieldRegionStateEditAddressPage.click();
        editAddressAccountPage.fieldRegionStateEditAddressPage.sendKeys(addresses.getFirst().regionState);
    }

    @And("click Continue")
    public void clickContinue() {
        new EditAddressAccountPage().accountPage.buttonContinueEditInformationPage.click();
    }

    @Then("the Address Book  page will say {string}")
    public void theAddressBookPageWillSay(String message) {
        assertEquals(message, new AddressBookAccountPage().messageSuccessfullyAddedAddressBookPage.getText());
    }

    @And("deleted the first record in the table")
    public void deletedTheFirstRecordInTheTable() {
        AddressBookAccountPage addressBookAccountPage = new AddressBookAccountPage();
        addressBookAccountPage.listButtonsDeleteAddressBookPage.getFirst().click();
        getDriver().switchTo().alert().accept();
    }

    @And("changes the LastName field in the last record to {string}")
    public void changesTheLastNameFieldInTheLastRecordTo(String newValueLastName) {
        EditAddressAccountPage editAddressAccountPage = new EditAddressAccountPage();
        AddressBookAccountPage addressBookAccountPage = new AddressBookAccountPage();
        addressBookAccountPage.listButtonsEditAddressBookPage.getLast().click();
        editAddressAccountPage.fieldLastNameEditAddressPage.clear();
        editAddressAccountPage.fieldLastNameEditAddressPage.sendKeys(newValueLastName);
        editAddressAccountPage.accountPage.buttonContinueEditInformationPage.click();
    }

    @And("goes to the Password")
    public void goesToThePassword() {
        new AccountPage().tableLinksRightComponent.linkPasswordRightTable.click();
    }

    @And("enters the value {string} in the Password field")
    public void entersTheValueInThePasswordField(String password) {
        ChangePasswordAccountPage changePasswordAccountPage = new ChangePasswordAccountPage();
        changePasswordAccountPage.fieldPasswordPagePassword.clear();
        changePasswordAccountPage.fieldPasswordPagePassword.sendKeys(password);
    }

    @And("enters the value {string} in the Password Confirm field")
    public void entersTheValueInThePasswordConfirmField(String confirmPassword) {
        ChangePasswordAccountPage changePasswordAccountPage = new ChangePasswordAccountPage();
        changePasswordAccountPage.fieldPasswordConfirmPagePassword.clear();
        changePasswordAccountPage.fieldPasswordConfirmPagePassword.sendKeys(confirmPassword);
    }

    @Then("under the Password Confirm field {string}")
    public void underThePasswordConfirmField(String errorMessage) {
        assertEquals(errorMessage, new ChangePasswordAccountPage().fieldMessageErrorPagePassword.getText());
    }

    @And("goes to the Edit Account")
    public void goesToTheEditAccount() {
        new AccountPage().tableLinksRightComponent.linkEditAccountRightTable.click();
    }

    @When("user fills in the fields First Name {string}, Last Name {string}, Telephone {string}")
    public void userFillsInTheFieldsFirstNameFirstNameLastNameLastNameEMailEmailTelephoneTelephone(String firstName, String lastName, String telephone) {
        EditInformationAccountPage editInformationAccountPage = new EditInformationAccountPage();
        editInformationAccountPage.fieldFirstNameEditInformationPage.clear();
        editInformationAccountPage.fieldFirstNameEditInformationPage.sendKeys(firstName);
        editInformationAccountPage.fieldLastNameEditInformationPage.clear();
        editInformationAccountPage.fieldLastNameEditInformationPage.sendKeys(lastName);
        editInformationAccountPage.fieldTelephoneEditInformationPage.clear();
        editInformationAccountPage.fieldTelephoneEditInformationPage.sendKeys(telephone);
    }

    @When("user fills in the fields First Name {string}, Last Name {string},  Telephone {string}")
    public void userFillsInTheFieldsFirstNameLastNameTelephone(String firstName, String lastName, String telephone) {
        EditInformationAccountPage editInformationAccountPage = new EditInformationAccountPage();
        editInformationAccountPage.fieldFirstNameEditInformationPage.clear();
        editInformationAccountPage.fieldFirstNameEditInformationPage.sendKeys(firstName);
        editInformationAccountPage.fieldLastNameEditInformationPage.clear();
        editInformationAccountPage.fieldLastNameEditInformationPage.sendKeys(lastName);
        editInformationAccountPage.fieldTelephoneEditInformationPage.clear();
        editInformationAccountPage.fieldTelephoneEditInformationPage.sendKeys(telephone);
    }

    @Then("the centre page will say {string}")
    public void theCentrePageWillSay(String message) {
        assertEquals(message, new AccountPage().messageCenterPageAccountInformation.getText());
    }

    @And("goes to the My Wish List Book")
    public void goesToTheMyWishListBook() {
        new AccountPage().tableLinksRightComponent.linkWishListRightTable.click();
    }

    @Then("in the list of products there is an item with the name {string}")
    public void inTheListOfProductsThereIsAnItemWithTheName(String nameProduct) {
        MyWishListAccountPage myWishListAccountPage = new MyWishListAccountPage();

        for (WebElement nameProductList : myWishListAccountPage.listProductNameMyWishListAccountPage) {
            if (nameProductList.getText().equals(nameProduct)) {
                assertEquals(nameProduct, nameProductList.getText());
                break;
            }
        }
    }

    @When("user goes to the {string}")
    public void userGoesToThe(String linkName) {
        new AccountPage().getWebElementMap().getElement(linkName).click();
    }

    @Then("a page will open up with the name {string}")
    public void aPageWillOpenUpWithTheName(String pageName) {
        assertEquals(pageName, new AccountPage().listTitlePathFormsAccountPage.getLast().getText());
    }

    @When("user goes to the {string} in the table")
    public void userGoesToTheInTheTable(String linkName) {
        new AccountPage().getWebElementTabMap().getElement(linkName).click();
    }

}
