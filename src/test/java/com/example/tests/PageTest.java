package com.example.tests;

import org.example.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTest {

    WebDriver driver;
    Page page;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
        page = new Page(driver);
    }


    @Test
    public void googleSearchTest() {
        page.open();
        page.search("Selenium WebDriver");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("selenium"));
    }

    @AfterClass
    public void teardown() {
        if (driver != null) driver.quit();
    }
}
