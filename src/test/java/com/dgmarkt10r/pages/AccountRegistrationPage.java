package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

    @FindBy(xpath = "//div[@class='container-inner']/h1")
    public WebElement titlesAccountRegistrationPage;

    @FindBy(css = "#input-register-password")
    public WebElement fieldPasswordRegistrationForm;

    @FindBy(css = "#input-telephone")
    public WebElement fieldTelephoneRegistrationForm;

    @FindBy(css = "#input-email")
    public WebElement fieldEMailRegistrationForm;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement buttonContinueRegistrationForm;

    @FindBy(xpath = "//input[@id='input-telephone']/../div")
    public WebElement messageErrorFieldTelephoneRegistrationForm;

    @FindBy(xpath = "//input[@id='input-register-password']/../div")
    public WebElement messageErrorFieldPasswordRegistrationForm;

    @FindBy(xpath = "//input[@id='input-email']/../div")
    public WebElement messageErrorFieldEMailRegistrationForm;
}