package com.dgmarkt10r.pages;

import com.dgmarkt10r.utils.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage() {
    }

    @FindBy(xpath = "//*[@name='email']")
    public WebElement fieldStandardEmail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement fieldStandardPassword;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement buttonLogin;

    public void enteringStandardLoginAndPassword() {
        fieldStandardEmail.sendKeys(ConfigurationReader.get("standard_login"));
        fieldStandardPassword.sendKeys(ConfigurationReader.get("password"));
        buttonLogin.click();
    }

    @FindBy(xpath = "//a[@class='a-close-newsletter']")
    public WebElement buttonCloseSubscribe;

    @FindBy(xpath = "//div[@class='slide-readmore']/a")
    public WebElement readmoreButton;

    @FindBy(xpath = "//div[@class='caption']/h4[@class='name']/a[.='Televisions']")
    public List<WebElement> linkTVCategory;

    @FindBy(xpath = "//*[text()='Category']")
    public WebElement category;

    @FindBy(css = "#cart-total")
    public WebElement cartTotal;

    @FindBy(css = "#cart")
    public WebElement cartIcon;

    public void closeSubscribeWindow() {
        buttonCloseSubscribe.click();
    }

    //Header
    @FindBy(xpath = "//span[.='My Account']")
    public WebElement headerMyAccountLink;

    @FindBy(xpath = "//a[@id='pt-register-link']")
    public WebElement headerMyAccountRegisterLink;

    @FindBy(xpath = "//a[@id='pt-login-link']")
    public WebElement headerMyAccountLoginLink;

    @FindBy(xpath = "//a[@id='pt-logout-link']")
    public WebElement headerMyAccountLogoutLink;

    @FindBy(xpath = "//li/a[.='My Account']")
    public WebElement headerMyAccountMyAccount;

    @FindBy(css = "#wishlist-total")
    public WebElement headerWishListIcon;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement headerMessageSuccessfullyLoginMainPage;

    //Footer
    @FindBy(xpath = "//a[.='My Account']")
    public WebElement footerMyAccount;

    @FindBy(xpath = "//a[.='Wish List']")
    public WebElement footerWishListLink;

    @FindBy(xpath = "//div[@class='title']")
    public WebElement titleTOPCategory;

    @FindBy (xpath = "//*[@id='header']/div[2]/div/div/ul/li[2]/a")
    public WebElement titleTextPageHealthBeauty;

    @FindBy(xpath = "//a[contains(text(), 'Health & Beauty')]")
    public List<WebElement> nameTOPFoto;
}