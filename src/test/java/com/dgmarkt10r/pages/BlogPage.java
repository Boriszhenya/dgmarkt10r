package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BlogPage extends BasePage {

    @FindBy(xpath = "//div[@class='col-hoz']//span[.='Blog']")
    public WebElement blogButton;

    @FindBy(css = "h1")
    public WebElement blogTitle;

    @FindBy(css = "img[alt$=\"Color\"]")
    public WebElement pictureFirstPost;

    @FindBy(css = "h1")
    public WebElement postTitle;

    @FindBy(css = ".swiper-button-next.related-posts-next")
    public WebElement buttonBlogRightArrow;

    @FindBy(css = "img[src*=\"5-450\"]")
    public WebElement pictureNextRight;

    @FindBy(css = "h4>a[href$=\"post_id=2\"]")
    public WebElement linkBottomFirstPost;

    @FindBy(css = "div.btn-more>a[href$='id=2']")
    public WebElement buttonRMBottomFirstPost;

    @FindBy(css = ".categories-widget>div:nth-child(4)>a")
    public WebElement menuCategoryBlogFashion;

    @FindBy(css = "h1")
    public WebElement titleCategoryBlogFashion;

    @FindBy(css = "h1")
    public WebElement titleLatestPost;

    @FindBy(css = " a[href$='id=16']> img")
    public WebElement pictureLatestPost;

}