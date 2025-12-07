package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page {

    private WebDriver driver;
    private By searchBox = By.name("q");

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public void search(String text) {
        driver.findElement(searchBox).sendKeys(text, Keys.ENTER);
    }
}
