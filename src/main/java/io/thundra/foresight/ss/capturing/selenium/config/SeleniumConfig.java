package io.thundra.foresight.ss.capturing.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SeleniumConfig {

    private WebDriver driver;

    public SeleniumConfig() {
        driver = new SafariDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());
    }

    public void navigateTo(String url) {
        driver.navigate()
                .to(url);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public WebDriver getDriver() {
        return driver;
    }
}