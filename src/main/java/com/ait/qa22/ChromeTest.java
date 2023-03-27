package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();    // разворачиваем на весь экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void openGoogle(){
        System.out.println("Google.com is opened in Chrome.");
    }
    @AfterMethod    // @AfterMethod(enabled = false) - если хотим отключить
    public void tearDown() {
        // close driver
        driver.quit();  // all tabs & browser close
        //driver.close; // only last tab (if tab only one -> close browser)
    }
}
