package com.kodilla.selenium.allegro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Documents/Development/Kodilla/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Zamknięcie potencjalnego alertu
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert found.");
        }

        // Wybór kategorii "Elektronika"
        WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-box-name='department'] select")));
        category.click();

        WebElement electronics = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-box-name='department'] option[value='257292']")));
        electronics.click();

        // Wpisanie "Mavic mini" w pole wyszukiwania
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='search']")));
        inputField.sendKeys("Mavic mini");

        // Kliknięcie przycisku "Szukaj"
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-role='search-button']")));
        searchButton.click();

        // Oczekiwanie na pierwszy wynik wyszukiwania i przypisanie wszystkich kart produktów do listy
        List<WebElement> productList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("section > article")));

        // Wyświetlenie informacji o produkcie dla każdego elementu z listy produktów
        for (WebElement product : productList) {
            System.out.println(product.getText());
            System.out.println("---------------------------------------");
        }
    }
}
