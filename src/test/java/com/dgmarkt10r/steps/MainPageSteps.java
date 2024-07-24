package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.dgmarkt10r.context.TestContext.getActions;
import static com.dgmarkt10r.context.TestContext.getWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageSteps {

    @When("the user go to a TOP category")
        public void theUserGoToATOPCategory() {
            MainPage mp = new MainPage();
            getActions().moveToElement(mp.titleTOPCategory).pause(2000).perform();
            getWait().until(ExpectedConditions.visibilityOf(mp.titleTOPCategory));
            assertEquals("Top Categories", mp.titleTOPCategory.getText());
        }

    @And("the user can see a product")
    public void theUserCanSeeTheProducts() {
        MainPage mp = new MainPage();
        getActions().moveToElement(mp.nameTOPFoto.get(3)).pause(2000).perform();
        mp.nameTOPFoto.get(3).click();
        assertEquals("Health & Beauty", mp.titleTextPageHealthBeauty.getText());
    }
}