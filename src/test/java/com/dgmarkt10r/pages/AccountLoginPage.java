package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends BasePage {
    //form Returning Customer
    @FindBy(css = "#input-email")
    public WebElement fieldInputEmailLoginPage;

    @FindBy(css = "#input-password")
    public WebElement fieldInputPasswordLoginPage;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement buttonLoginLoginPage;

    @FindBy(xpath = "//*[.='Continue']")
    public WebElement buttonContinueLoginPage;
}