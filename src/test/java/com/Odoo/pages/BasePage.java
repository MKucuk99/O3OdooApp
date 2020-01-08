package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
        Driver.get().manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }


}
