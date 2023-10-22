package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class KodillaPomApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Desktop/norbert_karp-kodilla_tester-dc5493a9bb8fa52cada3d3330b4c431440c82260/norbert_karp-kodilla_tester/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaLoginPom loginPom = new KodillaLoginPom(driver);
        loginPom.login("test@kodilla.com", "haslo");
        driver.close();
    }
}
