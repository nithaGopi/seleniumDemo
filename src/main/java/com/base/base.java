package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {
    public String baseURL = "https://demo.guru99.com/v4/";
    public String username = "mngr512566";
    public String password = "ypYtEza";
    public static WebDriver driver;


    @BeforeClass

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "//Users//praveen//Downloads//chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void termination() {
        driver.quit();
    }

}
