package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirefoxTest {
    WebDriver driver;

    //before - setUp() {}
    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

    // test
    @Test
    public void openGoogle() {
        System.out.println("Google.com  is opened in Firefox");
    }

    // after - tearDown() {}
}
