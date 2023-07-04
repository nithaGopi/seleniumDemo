package com.test;


 import com.base.base;
import com.pom.login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCase extends  base{

    @Test
    public void LoginTest() {

        driver.get(baseURL);

        login LPObj = new login(driver);
        LPObj.setUsername(username);
        LPObj.setUsername(username);
        LPObj.setTxtPassword(password);
        LPObj.clickSubmit();

        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        Assert.assertTrue(driver.getTitle().equals("Guru99 Bank Manager HomePage"));


    }
}


