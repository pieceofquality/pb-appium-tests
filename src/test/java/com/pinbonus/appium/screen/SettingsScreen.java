package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SettingsScreen {
    private AppiumDriver driver;

    @AndroidFindBy(id = "tvEnterNum")
    private WebElement authButton;

    @AndroidFindBy (id = "tvRegion")
    private WebElement regionButton;

    @AndroidFindBy (id = "tvLanguage")
    private WebElement languageButton;


    @AndroidFindBy (id = "tvPublicFeedback")
    private WebElement feedbackButton;

    @AndroidFindBy (id = "tvUnauthorizedHeader")
    private WebElement unauthHeader;

    @AndroidFindBy (id = "tvVersion")
    private WebElement versionFooter;

    public SettingsScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
