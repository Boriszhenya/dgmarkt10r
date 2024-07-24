package com.dgmarkt10r.pages;

import com.dgmarkt10r.context.WebElementMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountPage extends BasePage {

    public TableLinksRightComponent tableLinksRightComponent;

    public AccountPage() {
        tableLinksRightComponent = new TableLinksRightComponent();
    }

    @FindBy(xpath = "//ul[@class='breadcrumb']/li/a")
    public List<WebElement> listTitlePathFormsAccountPage;

    @FindBy(xpath = "//div[@id='account-account']/div")
    public WebElement messageCenterPageAccountInformation;

    //left column of page links
    @FindBy(xpath = "//a[.='Edit your account information']")
    public WebElement linksLeftColumnEditYourAccountInformation;

    @FindBy(xpath = "//a[.='Change your password']")
    public WebElement linksLeftColumnChangeYourPassword;

    @FindBy(xpath = "//a[.='Modify your address book entries']")
    public WebElement linksLeftColumnModifyYourAddressBookEntries;

    @FindBy(xpath = "//a[.='Modify your wish list']")
    public WebElement linksLeftColumnModifyYourWishList;

    @FindBy(xpath = "//a[.='View your order history']")
    public WebElement linksLeftColumnViewYourOrderHistory;

    @FindBy(xpath = "//ul[@class='list-unstyled']//a[.='Downloads']")
    public WebElement linksLeftColumnDownloads;

    @FindBy(xpath = "//a[.='Your Reward Points']")
    public WebElement linksLeftColumnYourRewardPoints;

    @FindBy(xpath = "//a[.='View your return requests']")
    public WebElement linksLeftColumnViewYourReturnRequests;

    @FindBy(xpath = "//a[.='Your Transactions']")
    public WebElement linksLeftColumnYourTransactions;

    @FindBy(xpath = "//a[.='Recurring payments']")
    public WebElement linksLeftColumnRecurringPayments;

    @FindBy(xpath = "//a[.='Register for an affiliate account']")
    public WebElement linksLeftColumnRegisterForAnAffiliateAccount;

    @FindBy(xpath = "//a[.='Subscribe / unsubscribe to newsletter']")
    public WebElement linksLeftColumnSubscribeUnsubscribeToNewsletter;

    //form pages elements
    @FindBy(xpath = "//a[.='Back']")
    public WebElement buttonBackEditInformationPage;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement buttonContinueEditInformationPage;

    public WebElementMap getWebElementMap() {
        Map<String, WebElement> locatorsMap = new HashMap<>();
        locatorsMap.put("Edit your account information", linksLeftColumnEditYourAccountInformation);
        locatorsMap.put("Change your password", linksLeftColumnChangeYourPassword);
        locatorsMap.put("Modify your address book entries", linksLeftColumnModifyYourAddressBookEntries);
        locatorsMap.put("Modify your wish list", linksLeftColumnModifyYourWishList);
        locatorsMap.put("View your order history", linksLeftColumnViewYourOrderHistory);
        locatorsMap.put("Downloads", linksLeftColumnDownloads);
        locatorsMap.put("Your Reward Points", linksLeftColumnYourRewardPoints);
        locatorsMap.put("View your return requests", linksLeftColumnViewYourReturnRequests);
        locatorsMap.put("Your Transactions", linksLeftColumnYourTransactions);
        locatorsMap.put("Recurring payments", linksLeftColumnRecurringPayments);
        locatorsMap.put("Register for an affiliate account", linksLeftColumnRegisterForAnAffiliateAccount);
        locatorsMap.put("Subscribe / unsubscribe to newsletter", linksLeftColumnSubscribeUnsubscribeToNewsletter);
        return new WebElementMap(locatorsMap);
    }

    public WebElementMap getWebElementTabMap() {
        AccountPage accountPage = new AccountPage();
        Map<String, WebElement> locatorsMap = new HashMap<>();
        locatorsMap.put("Edit Account", accountPage.tableLinksRightComponent.linkEditAccountRightTable);
        locatorsMap.put("Password", accountPage.tableLinksRightComponent.linkPasswordRightTable);
        locatorsMap.put("Address Book", accountPage.tableLinksRightComponent.linkAddressBookRightTable);
        locatorsMap.put("Wish List", accountPage.tableLinksRightComponent.linkWishListRightTable);
        locatorsMap.put("Order History", accountPage.tableLinksRightComponent.linkOrderHistoryRightTable);
        locatorsMap.put("Downloads", accountPage.tableLinksRightComponent.linkDownloadsRightTable);
        locatorsMap.put("Reward Points", accountPage.tableLinksRightComponent.linkRewardPointsRightTable);
        locatorsMap.put("Returns", accountPage.tableLinksRightComponent.linkReturnsRightTable);
        locatorsMap.put("Transactions", accountPage.tableLinksRightComponent.linkTransactionsRightTable);
        locatorsMap.put("Recurring Payments", accountPage.tableLinksRightComponent.linkRecurringPaymentsRightTable);
        locatorsMap.put("Newsletter", accountPage.tableLinksRightComponent.linkNewsletterRightTable);
        return new WebElementMap(locatorsMap);
    }
}