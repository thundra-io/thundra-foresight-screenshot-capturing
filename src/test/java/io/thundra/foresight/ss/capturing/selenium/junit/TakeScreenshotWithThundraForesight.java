package io.thundra.foresight.ss.capturing.selenium.junit;


import io.thundra.foresight.ss.capturing.selenium.config.SeleniumConfig;
import org.junit.AfterClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.test.context.event.annotation.AfterTestClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class TakeScreenshotWithThundraForesight {

    private SeleniumConfig config;
    private final String URL = "https://www.thundra.io/";

    public TakeScreenshotWithThundraForesight() {
        config = new SeleniumConfig();
        config.getDriver()
                .get(URL);
    }

    @AfterTestClass
    public void tearDown() {
            config.getDriver()
                    .close();
    }

    @Test
    public void whenThundraLoaded_thenTakeScreenshot() throws Exception{
        config.getDriver().get("https://www.thundra.io");
        TakesScreenshot scrShot =((TakesScreenshot)config.getDriver());
        File f = new File("test.jpg");
        Path originalPath = scrShot.getScreenshotAs(OutputType.FILE).toPath();
        Files.copy(originalPath, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

}