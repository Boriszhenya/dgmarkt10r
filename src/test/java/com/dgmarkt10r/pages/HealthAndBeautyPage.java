package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthAndBeautyPage extends BasePage{

    public HealthAndBeautyPage() {
    }

    @FindBy(xpath = "//h1[text()='Search - Headphone']")
    public WebElement titleHeadPhonePage;

    @FindBy (xpath = "//p[text()='There is no product that matches the search criteria.']")
    public WebElement messageOfHeadphonePage;


}
