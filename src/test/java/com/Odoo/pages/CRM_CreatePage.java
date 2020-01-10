package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRM_CreatePage extends LoginPage {

    @FindBy(css = "class=\"oe_menu_text\"")
    public WebElement menu;
    @FindBy(css = "[accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(css = " [class=\"modal-title\"]")
    public WebElement createAnOpportunity;

    @FindBy( css = "[name=\"name\"]")
    public WebElement opportunityTitle;

    @FindBy(css = "[id=\"o_field_input_205\"]")
    public WebElement customer;

    public void clickToCreateButton(){
        BrowserUtils.waitForVisibility(createButton, 5);
        BrowserUtils.waitForClickablility(createButton,5);
        createButton.click();
    }
}

