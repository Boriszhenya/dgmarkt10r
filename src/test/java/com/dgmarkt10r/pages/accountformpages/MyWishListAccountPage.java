package com.dgmarkt10r.pages.accountformpages;

import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyWishListAccountPage extends BasePage {
    public AccountPage accountPage;

    public MyWishListAccountPage() {
        accountPage = new AccountPage();
    }

    @FindBy(xpath = "//td[@class='text-left']/a")
    public List<WebElement> listProductNameMyWishListAccountPage;
}
