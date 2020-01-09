package com.Odoo.pages;

import com.Odoo.utilities.ConfigurationReader;

import com.Odoo.utilities.Driver;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BasePage{

    @FindBy(id = "login")

    public WebElement userName;



    @FindBy(id = "password")

    public WebElement passWord;



    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")

    public WebElement submit;



    public void login(String userType) {

        String userNameStr = "";

        String passwordStr = "";

        if (userType.equalsIgnoreCase("expenses manager")) {

            userNameStr = ConfigurationReader.getProperty("expensesManager_username");

            passwordStr = ConfigurationReader.getProperty("expensesManager_password");

        } else if (userType.equalsIgnoreCase("sales manager")) {

            userNameStr = ConfigurationReader.getProperty("salesManager_username");

            passwordStr = ConfigurationReader.getProperty("salesManager_password");

        } else if (userType.equalsIgnoreCase("events CRM manager")) {

            userNameStr = ConfigurationReader.getProperty("eventsCRM_Manager_userName");

            passwordStr = ConfigurationReader.getProperty("eventsCRM_Manager_password");

        }

        userName.sendKeys(userNameStr);

        passWord.sendKeys(passwordStr, Keys.ENTER);

    }
}
