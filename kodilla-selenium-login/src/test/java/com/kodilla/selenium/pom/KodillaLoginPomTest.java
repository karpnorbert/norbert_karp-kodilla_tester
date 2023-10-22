package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KodillaLoginPomTest {

    KodillaLoginPom loginPom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/Users/norbertkarp/Desktop/norbert_karp-kodilla_tester-dc5493a9bb8fa52cada3d3330b4c431440c82260/norbert_karp-kodilla_tester/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new FirefoxDriver(firefoxOptions);
        driver.navigate().to("https://kodilla.com/pl/test/login");
        loginPom = new KodillaLoginPom(driver);
    }

    @Test
    public void testLoginPage_CheckErrorValidation() {
        String email = "test@toniedziala.pl";
        String password = "password";
        boolean loggedIn = loginPom.login(email, password);
        assertFalse(loggedIn);
    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";
        boolean loggedIn = loginPom.login(email, password);
        assertTrue(loggedIn);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}
