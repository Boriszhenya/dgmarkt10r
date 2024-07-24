package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.*;
import com.dgmarkt10r.utils.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.dgmarkt10r.context.TestContext.getActions;
import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginLogoutSteps {

    @And("goes to the Login tab")
    public void goesToTheLoginTab() {
        new MainPage().headerMyAccountLoginLink.click();
        getWait().until(ExpectedConditions.visibilityOf(new LoginPopupWindow().buttonLoginFormLogin));
    }

    @And("enter a valid e-mail {string} and password {string}")
    public void enterAValidEMailAndPassword(String email, String password) {
        LoginPopupWindow loginForm = new LoginPopupWindow();
        loginForm.fieldEMailFormLogin.sendKeys(email);
        loginForm.fieldPasswordFormLogin.sendKeys(password);
        loginForm.buttonLoginFormLogin.click();
        getWait().until(ExpectedConditions.visibilityOf(new MainPage().headerMessageSuccessfullyLoginMainPage));
    }

    @Then("the main page will say {string}")
    public void theMainPageWillSay(String message) {
        assertTrue(new MainPage().headerMessageSuccessfullyLoginMainPage.getText().contains(message));
    }

    @And("already authorized")
    public void alreadyAuthorized() {
        new MainPage().headerMyAccountLink.click();
        goesToTheLoginTab();
        enterAValidEMailAndPassword(ConfigurationReader.get("normal_user_email"), ConfigurationReader.get("normal_user_password"));
    }

    @And("goes to the Logout tab")
    public void goesToTheLogoutTab() {
        getWait().until(ExpectedConditions.visibilityOf(new MainPage().headerMyAccountLogoutLink));
        new MainPage().headerMyAccountLogoutLink.click();
        getWait().until(ExpectedConditions.visibilityOf(new LogoutPopupWindow().titleAccountLogoutPopupWindow));
    }

    @Then("a pop-up window appears with the name {string} on it")
    public void aPopUpWindowAppearsWithTheNameOnIt(String title) {
        assertEquals(title, new LogoutPopupWindow().titleAccountLogoutPopupWindow.getText());
    }

    @When("a user goes to the My Account menu using the link in the footer")
    public void aUserGoesToTheMyAccountMenuUsingTheLinkInTheFooter() {
        MainPage mainPage = new MainPage();
        getActions().moveToElement(mainPage.footerMyAccount);
        mainPage.footerMyAccount.click();
        getWait().until(ExpectedConditions.visibilityOf(new AccountLoginPage().fieldInputEmailLoginPage));
    }

    @And("user authorizes using valid data")
    public void userAuthorizesUsingValidData() {
        AccountLoginPage accountLoginPage = new AccountLoginPage();
        accountLoginPage.fieldInputEmailLoginPage.sendKeys(ConfigurationReader.get("normal_user_email"));
        accountLoginPage.fieldInputPasswordLoginPage.sendKeys(ConfigurationReader.get("normal_user_password"));
        accountLoginPage.buttonLoginLoginPage.click();
    }

    @Then("the {string} page opens")
    public void thePageOpens(String path) {
        assertEquals(path, new AccountPage().listTitlePathFormsAccountPage.get(1).getText());
    }

    @And("goes to the My Account")
    public void goesToTheMyAccount() {
        new MainPage().headerMyAccountMyAccount.click();
    }

    @And("clicks on the Logout link")
    public void clicksOnTheLogoutLink() {
        new AccountPage().tableLinksRightComponent.logoutLinksAccountPage.click();
    }

    @Then("then user exit from My Account to the {string} page")
    public void thenUserExitFromMyAccountToThePage(String title) {
        assertEquals(title, new AccountLogoutPage().titleAccountLogoutPage.getText());
    }
}