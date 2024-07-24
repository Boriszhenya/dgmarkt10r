package com.dgmarkt10r.pages.accountformpages;

import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddressAccountPage extends BasePage {

    public AccountPage accountPage;

    public EditAddressAccountPage() {
        accountPage = new AccountPage();
    }

    @FindBy(css = "#input-firstname")
    public WebElement fieldFirstNameEditAddressPage;

    @FindBy(css = "#input-lastname")
    public WebElement fieldLastNameEditAddressPage;

    @FindBy(css = "#input-company")
    public WebElement fieldCompanyEditAddressPage;

    @FindBy(css = "#input-address-1")
    public WebElement fieldAddress1EditAddressPage;

    @FindBy(css = "#input-address-2")
    public WebElement fieldAddress2EditAddressPage;

    @FindBy(css = "#input-city")
    public WebElement fieldCityEditAddressPage;

    @FindBy(css = "#input-postcode")
    public WebElement fieldPostCodeEditAddressPage;

    @FindBy(css = "#input-country")
    public WebElement fieldCountryEditAddressPage;

    @FindBy(css = "#input-zone")
    public WebElement fieldRegionStateEditAddressPage;

    @FindBy(xpath = "//input[@value='1'][@type='radio']")
    public WebElement fieldDefaultAddressYesEditAddressPage;

    @FindBy(xpath = "//input[@value='0'][@type='radio']")
    public WebElement fieldDefaultAddressNoEditAddressPage;
}