package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        // Ustawienie lokalizacji sterownika geckodriver dla przeglądarki Firefox
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Documents/Development/Kodilla/geckodriver");

        // Tworzenie nowej instancji przeglądarki Firefox
        WebDriver driver = new FirefoxDriver();

        // Otwarcie strony eBay
        driver.get("https://www.ebay.com/");

        // Znalezienie pola do wyszukiwania przedmiotów i wpisanie "Laptop"
        WebElement searchField = driver.findElement(By.id("gh-ac"));
        searchField.sendKeys("Laptop");

        // Zatwierdzenie wyszukiwania
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

    }
}
