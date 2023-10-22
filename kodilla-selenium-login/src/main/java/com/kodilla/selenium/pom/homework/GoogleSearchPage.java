package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleSearchPage {

    @FindBy(name = "q")
    private WebElement searchField;

    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String phrase) {
        searchField.clear();
        searchField.sendKeys(phrase);
        searchField.submit();
    }

    public WebElement selectRandomResult() {
        List<WebElement> results = driver.findElements(By.cssSelector("h3"));
        Random rand = new Random();
        int randomIndex = rand.nextInt(results.size());
        return results.get(randomIndex);
    }
}
