package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.BlogPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.dgmarkt10r.context.TestContext.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlogSteps {

    @When("the user clicks on Blog button")
    public void clickBlogButton() {
        BlogPage bp = new BlogPage();
        bp.blogButton.click();
    }

    @Then("the title Blog should be displayed")
    public void titleBlogBeDisplayed() {
        assertEquals("Blog", new BlogPage().blogTitle.getText());
    }

    @Given("user is on the Blog page")
    public void userIsOnTheBlogPage() {
        BlogPage bp = new BlogPage();
        bp.blogButton.click();
        assertEquals("Blog", new BlogPage().blogTitle.getText());
    }

    @When("user clicks on first post picture")
    public void userClicksOnFirstPostPicture() {
        BlogPage bp = new BlogPage();
        bp.pictureFirstPost.click();
    }

    @Then("title post should be displayed {string}")
    public void titlePostShouldBeDisplayed(String postTitle) {
        assertEquals(postTitle, new BlogPage().postTitle.getText());
    }

    @When("user clicks on right arrow")
    public void userClicksOnRightArrow() {
        BlogPage bp = new BlogPage();
        getJs().executeScript("window.scrollBy(0,1000)");
        getActions().moveToElement(bp.pictureNextRight);
        bp.buttonBlogRightArrow.click();
    }
    @Then("title next right post should be displayed {string}")
    public void titleNextRightPostShouldBeDisplayed(String titleNextRight) {
        getWait().until(ExpectedConditions.visibilityOf(new BlogPage().pictureNextRight));
        assertEquals(titleNextRight, new BlogPage().pictureNextRight.getAttribute("alt"));
    }

    @And("user is in the bottom of main page")
    public void userIsInTheBottomOfMainPage() {
        getJs().executeScript("window.scrollBy(0,1000)");
    }

    @When("user clicks on first post link")
    public void userClicksOnFirstPostLink() {
        new BlogPage().linkBottomFirstPost.click();
    }

    @When("user clicks on first post button Read More")
    public void userClicksOnFirstPostButtonReadMore() {
        new BlogPage().buttonRMBottomFirstPost.click();
    }

    @When("user clicks on category name")
    public void userClicksOnCategoryName() {
        new BlogPage().menuCategoryBlogFashion.click();
    }

    @Then("title category should be displayed {string}")
    public void titleCategoryShouldBeDisplayed(String titleCategory) {
        assertEquals(titleCategory, new BlogPage().titleCategoryBlogFashion.getText());
    }

    @When("user clicks on latest post picture")
    public void userClicksOnLatestPostPicture() {
        new BlogPage().pictureLatestPost.click();
    }

    @Then("title latest post should be displayed {string}")
    public void titleLatestPostShouldBeDisplayed(String titleLatestPost) {
        assertEquals(titleLatestPost, new BlogPage().titleLatestPost.getText());
    }
}
