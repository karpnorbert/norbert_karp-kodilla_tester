package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStoreTest {

    WebDriver driver;
    KodillaStorePom store;

    @BeforeEach
    public void setup() {
        driver = new FirefoxDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        store = new KodillaStorePom(driver);
    }

    @Test
    public void testSearchResultsCount() {
        String[] phrases = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};
        int[] expectedCounts = {5, 2, 3, 4, 6, 4};  // These numbers are hypothetical. Adjust based on actual results.

        for (int i = 0; i < phrases.length; i++) {
            store.searchFor(phrases[i]);
            assertEquals(expectedCounts[i], store.getNumberOfResults());

            store.searchFor(phrases[i].toLowerCase());
            assertEquals(expectedCounts[i], store.getNumberOfResults());

            store.searchFor(phrases[i].toUpperCase());
            assertEquals(expectedCounts[i], store.getNumberOfResults());
        }
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
