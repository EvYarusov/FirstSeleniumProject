package com.ait.qa22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EdgeTest {
    WebDriver driver2;
    @BeforeMethod
    public void setUp() {
        driver2 = new EdgeDriver();
        driver2.get("https://www.google.com");
    }
    @Test
    public void openGoogle(){
        System.out.println("Google.com is opened in EDGE.");
    }
}
