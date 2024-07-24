package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TableLinksRightComponent extends BasePage{


    @FindBy(xpath = "//a[.='Login'][@class='list-group-item']")
    public WebElement linkLoginRightTable;

    @FindBy(xpath = "//a[.='Register'][@class='list-group-item']")
    public WebElement linkRegisterRightTable;

    @FindBy(xpath = "//a[.='Forgotten Password'][@class='list-group-item']")
    public WebElement linkForgottenPasswordRightTable;

    @FindBy(xpath = "//a[.='My Account'][@class='list-group-item']")
    public WebElement linkMyAccountRightTable;

    @FindBy(xpath = "//a[.='Edit Account'][@class='list-group-item']")
    public WebElement linkEditAccountRightTable;

    @FindBy(xpath = "//a[.='Password'][@class='list-group-item']")
    public WebElement linkPasswordRightTable;

    @FindBy(xpath = "//a[.='Address Book'][@class='list-group-item']")
    public WebElement linkAddressBookRightTable;

    @FindBy(xpath = "//a[.='Wish List'][@class='list-group-item']")
    public WebElement linkWishListRightTable;

    @FindBy(xpath = "//a[.='Order History'][@class='list-group-item']")
    public WebElement linkOrderHistoryRightTable;

    @FindBy(xpath = "//a[.='Downloads'][@class='list-group-item']")
    public WebElement linkDownloadsRightTable;

    @FindBy(xpath = "//a[.='Recurring payments'][@class='list-group-item']")
    public WebElement linkRecurringPaymentsRightTable;

    @FindBy(xpath = "//a[.='Reward Points'][@class='list-group-item']")
    public WebElement linkRewardPointsRightTable;

    @FindBy(xpath = "//a[.='Returns'][@class='list-group-item']")
    public WebElement linkReturnsRightTable;

    @FindBy(xpath = "//a[.='Transactions'][@class='list-group-item']")
    public WebElement linkTransactionsRightTable;

    @FindBy(xpath = "//a[.='Newsletter'][@class='list-group-item']")
    public WebElement linkNewsletterRightTable;

    @FindBy(xpath = "//a[@class='list-group-item'][.='Logout']")
    public WebElement logoutLinksAccountPage;

    private final List<WebElement> linksList;

    public TableLinksRightComponent() {
        linksList = new ArrayList<>();
        collectLinks();
    }

    private void collectLinks() {
        linksList.add(linkRewardPointsRightTable);
        linksList.add(linkReturnsRightTable);
        linksList.add(linkTransactionsRightTable);
        linksList.add(linkNewsletterRightTable);
    }

    public List<WebElement> getLinksList() {
        return linksList;
    }
}