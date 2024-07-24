package com.dgmarkt10r.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CategoryPage extends BasePage{

    public CategoryPage (){
            }

    @FindBy(xpath = "//div[@class='inner']/a/img[@title='Cello C1920FS 19\" LED-backlit LCD TV']")
    public WebElement productImage;

    @FindBy(xpath = "//button[@class='button-cart']")
    public List <WebElement> addToCartIcon;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]/a[.='shopping cart']")
    public WebElement linkToCart;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
    public WebElement successMessage;

    @FindBy (xpath = "//span[text()='Category']")
    public WebElement titleCategory;

    @FindBy(xpath = "//*[contains(@class, 'sub-item2-category-content')]")
    public List<WebElement>  allElementsInCategory;

    @FindBy(xpath = "//a[text()='Health & Beauty'][@class='a-mega-second-link']")
    public WebElement titleHealthAndBeauty;

    @FindBy (xpath = "//h1[text()='Health & Beauty']")
    public WebElement titleTextPageHealthBeauty;

    @FindBy (xpath = "//a[text()='Headphone']")
    public WebElement titleHeadphone;
}