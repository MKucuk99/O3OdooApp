package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class importPage {

    @FindBy(css = "div[class='loader-mask shown']")
    public WebElement loaderMask;

    @FindBy(partialLinkText = "CRM")
    public WebElement CRM;

    @FindBy(css = "button.btn.btn-sm.btn-default.o_button_import")
    public WebElement Import;

    @FindBy(css = "span:nth-child(2) > label")
    public WebElement loadFile;

    @FindBy(css = "div.oe_import_error_report > div")
    public WebElement importPreviewFailed;

    public boolean waitUntilLoaderMaskDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Loader mask not found!");
            e.printStackTrace();
            return true; // no loader mask, all good, return true
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void uploadLogo(String pathToTheFile) {
        BrowserUtils.waitForVisibility(loadFile, 15);
        loadFile.sendKeys(pathToTheFile);
    }
}
