package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom extends AbstractPom {

    @FindBy(name = "search")
    private WebElement searchField;

    @FindBy(css = ".products-list")
    private WebElement productsList;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String phrase) {
        searchField.sendKeys(phrase);
        searchField.submit();
    }

    public int getNumberOfResults() {
        return productsList.findElements(By.cssSelector(".product-box")).size();
    }
}
