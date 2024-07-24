package com.dgmarkt10r.pages.accountformpages;

import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordAccountPage extends BasePage {
    public AccountPage accountPage;

    public ChangePasswordAccountPage(){
        accountPage=new AccountPage();
    }

    @FindBy(css = "#input-password")
    public WebElement fieldPasswordPagePassword;

    @FindBy(css = "#input-confirm")
    public WebElement fieldPasswordConfirmPagePassword;

    @FindBy(xpath = "//div[@class='text-danger']")
    public WebElement fieldMessageErrorPagePassword;
}