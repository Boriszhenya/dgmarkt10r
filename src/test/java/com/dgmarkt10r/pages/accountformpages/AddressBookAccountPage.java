package com.dgmarkt10r.pages.accountformpages;

import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddressBookAccountPage extends BasePage {

    public AccountPage accountPage;

    public AddressBookAccountPage(){
        accountPage=new AccountPage();
    }

    @FindBy(xpath = "//a[.='Edit']")
    public List<WebElement> listButtonsEditAddressBookPage;

    @FindBy(xpath = "//a[.='Delete']")
    public List<WebElement> listButtonsDeleteAddressBookPage;

    @FindBy(xpath = "//a[.='New Address']")
    public WebElement buttonNewAddressBookPage;

    @FindBy(xpath = "//div[@id='account-address']/div")
    public WebElement messageSuccessfullyAddedAddressBookPage;
}
