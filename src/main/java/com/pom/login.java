package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login{
    WebDriver localDriver;

    public login(WebDriver remoteDriver) {
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    //...............................
    @FindBy(name = "uid")
    @CacheLookup
    WebElement txtUserName;

    //...............................
    @FindBy(name = "password")
    @CacheLookup
    WebElement txtPassword;
    //...............................
    @FindBy(name = "btnLogin")
    @CacheLookup
    WebElement btnLogin;

    //..................................Action Methods of the webElements
    public void setUsername(String uname) {
        txtUserName.sendKeys(uname);
    }

    public void setTxtPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit() {
        btnLogin.click();
    }
}
