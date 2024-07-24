package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogoutPage extends BasePage{
    @FindBy(xpath = "//div[@class='container-inner']/h1")
    public WebElement titleAccountLogoutPage;
}