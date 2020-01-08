package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private By loaderBy = By.className("o_loading");

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModule(String moduleName) {
        BrowserUtils.waitForPageToLoad(10);
        String locator = "//nav[@id='oe_main_menu_navbar']//span[normalize-space()='" + moduleName + "']";
        WebElement moduleElement = Driver.get().findElement(By.xpath(locator));
        BrowserUtils.clickWithWait(moduleElement);
    }

    public void waitUntilLoadingCompleted(int time){
        WebDriverWait wait = new WebDriverWait(Driver.get(), time);
        wait.until(ExpectedConditions.presenceOfElementLocated(loaderBy));
        wait.until(ExpectedConditions.invisibilityOf(Driver.get().findElement(loaderBy)));
    }

    public void waitUntilLoadingCompleted(){
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(loaderBy));
        wait.until(ExpectedConditions.invisibilityOf(Driver.get().findElement(loaderBy)));
    }
}
