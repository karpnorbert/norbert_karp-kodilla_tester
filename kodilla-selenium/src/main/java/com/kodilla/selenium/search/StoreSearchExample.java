package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StoreSearchExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Documents/Development/Kodilla/geckodriver");  	// [1]
        WebDriver driver = new FirefoxDriver();
        driver.get("https://kodilla.com/pl/test/store");

        WebElement inputField = driver.findElement(By.name("search"));
        ((WebElement) inputField).sendKeys("School");
        inputField.submit();                                  	// [1]
    }
}