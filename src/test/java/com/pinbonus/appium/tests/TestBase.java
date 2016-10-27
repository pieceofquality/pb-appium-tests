package com.pinbonus.appium.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    private static AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/apps/");
        File app = new File(appDir, "pinbonus.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");

        capabilities.setCapability("unicodeKeyboard", true);

        capabilities.setCapability("app", app.getAbsolutePath());

        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
