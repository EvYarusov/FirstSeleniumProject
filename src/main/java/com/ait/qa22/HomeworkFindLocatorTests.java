package com.ait.qa22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeworkFindLocatorTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://ilcarro.web.app/let-car-work");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void getElementByCssSelectorTest() {
        driver.findElement(By.cssSelector(".title"));

        driver.findElement(By.cssSelector("#pickUpPlace"));

        driver.findElement(By.cssSelector("[ng-reflect-name*='ake']"));

        driver.findElement(By.cssSelector("[for$='del']"));

        driver.findElements(By.cssSelector("select.ng-touched"));

        driver.findElements(By.cssSelector("[ng-reflect-value^='G']"));

        driver.findElements(By.cssSelector(".file-input-label[for*='p']"));

        driver.findElements(By.cssSelector(".ng-pristine.ng-valid.ng-touched"));

        driver.findElement(By.cssSelector("input[id$='lace']"));

        driver.findElement(By.cssSelector("input[placeholder]"));
    }
    @Test
    public void getElementByXpathTest() {
        driver.findElement(By.xpath("//div[@class = 'title']"));

        driver.findElement(By.xpath("//*[@id = 'pickUpPlace']"));

        driver.findElement(By.xpath("//*[contains(@ng-reflect-name, 'ake')]"));

        driver.findElement(By.xpath("//*[contains(@for, 'del')]"));

        driver.findElements(By.xpath("//select[@class = 'ng-touched']"));

        driver.findElements(By.xpath("//*[starts-with(@ng-reflect-value, 'G')]"));

        driver.findElements(By.xpath("//*[@class = 'file-input-label'] [contains(@for, 'p')]"));

        driver.findElements(By.xpath("//*[@class = 'ng-pristine ng-valid ng-touched']" ));

        driver.findElement(By.xpath("//input[contains(@id, 'lace')]"));

        driver.findElement(By.xpath("//input[@placeholder]"));
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
