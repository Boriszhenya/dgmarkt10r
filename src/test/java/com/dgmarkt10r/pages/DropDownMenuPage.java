package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownMenuPage extends BasePage {

    public DropDownMenuPage() {
    }

    @FindBy(xpath = "//button[@class='btn btn-danger btn-xs button-cart-remove']")
    public WebElement buttonCartRemove;

    @FindBy(xpath = "//*[.=' View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[.=' Checkout']")
    public WebElement checkoutButtonFromDropDownMenu;
}