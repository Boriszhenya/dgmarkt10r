package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPopupWindow extends BasePage{

    @FindBy(xpath = "//h2[.='Account Logout']")
    public WebElement titleAccountLogoutPopupWindow;

    @FindBy(xpath = "(//button[@onclick=\"window.location.href='https://dgmarkt.com/'\"]")
    public WebElement buttonContinueAccountLogoutPopupWindow;
}