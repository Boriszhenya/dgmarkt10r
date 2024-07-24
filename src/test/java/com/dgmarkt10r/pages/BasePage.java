package com.dgmarkt10r.pages;

import com.dgmarkt10r.context.TestContext;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(TestContext.getDriver(), this);
    }
}
