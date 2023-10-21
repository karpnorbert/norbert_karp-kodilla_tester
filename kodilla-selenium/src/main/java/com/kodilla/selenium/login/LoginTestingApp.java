package com.kodilla.selenium.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class LoginTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Documents/Development/Kodilla/geckodriver");  // Uzupełnij ścieżką do twojego geckodrivera

        WebDriver driver = new FirefoxDriver();
        driver.get("https://kodilla.com/pl/test/login");

        WebElement emailField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        emailField.sendKeys("testuser@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        passwordField.sendKeys("Haslo");
    }
}
