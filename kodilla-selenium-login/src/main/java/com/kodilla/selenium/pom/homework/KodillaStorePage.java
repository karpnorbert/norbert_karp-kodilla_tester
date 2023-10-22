package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import java.util.List;

public class KodillaStorePage {

    private WebDriver driver;
    private By searchFieldLocator = By.id("searchField");

    public KodillaStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String query) {
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.clear();
        searchField.sendKeys(query);
        searchField.sendKeys(Keys.RETURN);
    }

    public int getNumberOfSearchResults() {
        // Uzupełnij selektor CSS odpowiednio dla elementów wyników wyszukiwania
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".search-result"));
        return searchResults.size();
    }
}
