package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KodillaStorePageTest {

    @Test
    public void testSearchFunctionality() {
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Desktop/norbert_karp-kodilla_tester-dc5493a9bb8fa52cada3d3330b4c431440c82260/norbert_karp-kodilla_tester/geckodriver");
        WebDriver driver = new FirefoxDriver();
        KodillaStorePage storePage = new KodillaStorePage(driver);

        String[] searchQueries = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};
        int[] expectedResults = {0,0,0,0,0,0}; // Przykładowe oczekiwane wyniki, musisz dostosować te liczby

        driver.get("https://kodilla.com/pl/test/store");

        for (int i = 0; i < searchQueries.length; i++) {
            storePage.searchFor(searchQueries[i]);
            Assertions.assertEquals(0, storePage.getNumberOfSearchResults(), "Incorrect number of search results for query: " + searchQueries[i]);


            // Test dla małych liter
            storePage.searchFor(searchQueries[i].toLowerCase());
            Assertions.assertEquals(expectedResults[i], storePage.getNumberOfSearchResults(), "Incorrect number of search results for lowercase query: " + searchQueries[i]);

            // Test dla dużych liter
            storePage.searchFor(searchQueries[i].toUpperCase());
            Assertions.assertEquals(expectedResults[i], storePage.getNumberOfSearchResults(), "Incorrect number of search results for uppercase query: " + searchQueries[i]);
        }

        driver.quit();
    }
}
