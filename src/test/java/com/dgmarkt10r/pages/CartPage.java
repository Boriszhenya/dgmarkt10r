package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    public CartPage() {
    }

    @FindBy(xpath = "//div[@class='container-inner']/h1")
    public WebElement shoppingCartTitle;

    @FindBy(xpath = "//div[@class='input-group btn-block']/input")
    public WebElement fieldOfQuantity;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement updateButton;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
    public WebElement successUpdateMessage;

    @FindBy(xpath = "//div[@id='content']/p[.='Your shopping cart is empty!']")
    public WebElement emptyCartMessage;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
    public WebElement applyCouponMessage;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
    public WebElement applyShippingEstimateMessage;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement removeItemButton;

    @FindBy(xpath = "//*[.='Use Coupon Code ']/a")
    public WebElement couponLink;

    @FindBy(xpath = "//*[.='Estimate Shipping & Taxes ']/a[@class='accordion-toggle']")
    public WebElement estimateShippingLink;

    @FindBy(xpath = "//*[.='Use Gift Certificate ']/a")
    public WebElement giftCertificateLink;

    @FindBy(css = "#input-coupon")
    public WebElement couponInput;

    @FindBy(css = "#button-coupon")
    public WebElement applyCouponButton;

    @FindBy(css = "#input-voucher")
    public WebElement giftCertificateInput;

    @FindBy(css = "#button-voucher")
    public WebElement applyGiftCertificate;

    @FindBy(css = "#input-country")
    public WebElement selectCountry;

    @FindBy(css = "#input-zone")
    public WebElement selectRegion;

    @FindBy(css = "#input-postcode")
    public WebElement postCodeInput;

    @FindBy(css = "#button-quote")
    public WebElement getQuotesButton;

    @FindBy(xpath = "//div[@class='radio']/label")
    public WebElement flatRate;

    @FindBy(css = "#button-shipping")
    public WebElement applyShippingButton;

    @FindBy(xpath = "//div/a[@class='btn btn-default']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//div/a[@class='btn btn-primary']")
    public WebElement checkoutButtonFromCart;

    @FindBy(xpath = "//div[@class='table-responsive']//tbody//td[last()]")
    public WebElement totalPrice;

    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tbody//td[last()]")
    public List<WebElement> priceWithDiscount;
}

