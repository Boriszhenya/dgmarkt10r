package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopupWindow extends BasePage{

    //form "Login or create an account"
    @FindBy(xpath = "//h2[.='Login or create an account']")
    public WebElement formLoginTextFormLogin;

    @FindBy(css = "#input-email")
    public WebElement fieldEMailFormLogin;

    @FindBy(css = "#input-password")
    public WebElement fieldPasswordFormLogin;

    @FindBy(xpath = "//span[.='Login']/..")
    public WebElement buttonLoginFormLogin;

    @FindBy(xpath = "//span[.='Create an account']/..")
    public WebElement buttonCreateAccountFormLogin;

    @FindBy(xpath = "//a[@class='a-close-frm']")
    public WebElement buttonCloseFormLogin;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement alertMessageFormLogin;
}