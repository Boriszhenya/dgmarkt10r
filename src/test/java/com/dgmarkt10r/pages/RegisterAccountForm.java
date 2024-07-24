package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterAccountForm extends BasePage {

    public RegisterAccountForm() {
    }

    @FindBy(xpath = "//div[@class='account-register']/div/h2")
    public WebElement titleForm;

    @FindBy(css = "#input-register-password")
    public WebElement fieldPasswordRegistrationForm;

    @FindBy(css = "#input-confirm")
    public WebElement fieldPasswordConfirmRegistrationForm;

    @FindBy(css = "#input-telephone")
    public WebElement fieldTelephoneRegistrationForm;

    @FindBy(css = "#input-register-email")
    public WebElement fieldEMailRegistrationForm;

    @FindBy(css = "#input-firstname")
    public WebElement fieldFirstNameRegistrationForm;

    @FindBy(css = "#input-lastname")
    public WebElement fieldLastNameRegistrationForm;

    @FindBy(xpath = "//input[@id='input-telephone']/../div")
    public WebElement messageErrorFieldTelephoneRegistrationForm;

    @FindBy(xpath = "//input[@id='input-register-password']/../div")
    public WebElement messageErrorFieldPasswordRegistrationForm;

    @FindBy(xpath = "//input[@id='input-register-email']/../div")
    public WebElement messageErrorFieldEMailRegistrationForm;

    @FindBy(xpath = "//input[@id='input-firstname']/../div")
    public WebElement messageErrorFieldFirstNameRegistrationForm;

    @FindBy(xpath = "//input[@id='input-lastname']/../div")
    public WebElement messageErrorFieldLastNameRegistrationForm;

    @FindBy(xpath = "//input[@type='checkbox'][@value='1']")
    public WebElement checkboxPrivacyPolicyRegistrationForm;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement buttonContinueRegistrationForm;

    @FindBy(xpath = "//div[@class='account-success']//h2")
    public WebElement titleRegistrationConfirmationWindowRegistrationForm;

    public String getTextTitle() {
        return titleForm.getText();
    }
}