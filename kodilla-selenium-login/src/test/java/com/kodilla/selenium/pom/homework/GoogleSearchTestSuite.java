package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchTestSuite {

    private WebDriver driver;
    private GoogleSearchPage googleSearch;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Desktop/norbert_karp-kodilla_tester-dc5493a9bb8fa52cada3d3330b4c431440c82260/norbert_karp-kodilla_tester/geckodriver");
        driver = new FirefoxDriver();
        driver.navigate().to("https://google.pl");
        googleSearch = new GoogleSearchPage(driver);
    }

    @Test
    public void testRandomSearchResultClick() {
        googleSearch.searchFor("Kodilla");
        WebElement randomResult = googleSearch.selectRandomResult();
        String resultText = randomResult.getText();
        randomResult.click();
        assertTrue(driver.getPageSource().contains(resultText));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
