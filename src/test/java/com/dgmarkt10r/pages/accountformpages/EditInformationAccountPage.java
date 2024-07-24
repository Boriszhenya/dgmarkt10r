package com.dgmarkt10r.pages.accountformpages;

import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditInformationAccountPage extends BasePage {

    public AccountPage accountPage;

    public EditInformationAccountPage() {
        accountPage = new AccountPage();
    }

    @FindBy(css = "#input-firstname")
    public WebElement fieldFirstNameEditInformationPage;

    @FindBy(css = "#input-lastname")
    public WebElement fieldLastNameEditInformationPage;

    @FindBy(css = "#input-email")
    public WebElement fieldEmailEditInformationPage;

    @FindBy(css = "#input-telephone")
    public WebElement fieldTelephoneEditInformationPage;
}