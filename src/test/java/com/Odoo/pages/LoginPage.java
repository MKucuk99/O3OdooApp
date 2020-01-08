package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id="login")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement passWord;

    @FindBy(xpath ="//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")
    public WebElement submit;

    public static void main(String[] args) {
        Driver.get().get("http://34.220.250.213/web/login");

        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("expensesmanager40@info.com");
        loginPage.passWord.sendKeys("expensesmanager");
        loginPage.submit.click();

    }
}
