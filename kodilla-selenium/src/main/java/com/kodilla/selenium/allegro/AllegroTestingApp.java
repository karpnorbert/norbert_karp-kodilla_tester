package com.kodilla.selenium.allegro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/norbertkarp/Documents/Development/Kodilla/geckodriver");  // Wstaw ścieżkę do pliku geckodriver na Twoim komputerze

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.allegro.pl/");

        // Zamknięcie potencjalnego alertu
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert found.");
        }

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wybór kategorii "Elektronika"
        WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-box-name,'department')]//select")));
        category.click();

        WebElement electronics = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-box-name,'department')]//option[contains(.,'Elektronika')]")));
        electronics.click();

        // Wpisanie "Mavic mini" w pole wyszukiwania
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='search']")));
        inputField.sendKeys("Mavic mini");

        // Kliknięcie przycisku "Szukaj"
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@data-role,'search-button')]")));
        searchButton.click();
    }
}
