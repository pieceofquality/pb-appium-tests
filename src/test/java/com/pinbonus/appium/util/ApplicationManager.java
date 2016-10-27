package com.pinbonus.appium.util;

import com.pinbonus.appium.screen.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private static AppiumDriver driver;
    public static Properties prop = new Properties();
    private static AddEditCardScreen addEditCardScreen;
    private static AuthSelectScreen authSelectScreen;
    private static CardListScreen cardListScreen;
    private static CardReaderScreen cardReaderScreen;
    private static CardScreen cardScreen;
    private static NumberValidationScreen numberValidationScreen;
    private static PhoneAuthScreen phoneAuthScreen;
    private static PhotoViewScreen photoViewScreen;
    private static SettingsScreen settingsScreen;
    private static WelcomeScreen welcomeScreen;

    static InputStream input = null;

    public static AppiumDriver<MobileElement> getDriver() throws IOException {
        input = new FileInputStream("property/platform.properties");
        prop.load(input);
        if(prop.getProperty("platform").equals("android")){
            androidSetup();


        }else if (prop.getProperty("platform").equals("ios")){
            iosSetup();
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver;
    }

    public static void androidSetup() throws MalformedURLException {
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

    public static void iosSetup() throws MalformedURLException{
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/apps/");
        File app = new File(appDir, "pinbonus.app");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iOS Simulator");
        capabilities.setCapability("platformVersion", "9.3");

        capabilities.setCapability("app", app.getAbsolutePath());

        driver =  new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}

