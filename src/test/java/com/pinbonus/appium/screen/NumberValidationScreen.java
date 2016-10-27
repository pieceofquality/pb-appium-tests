package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class NumberValidationScreen {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    @AndroidFindBy (id = "etCode")
    private WebElement codeNumberField;

    @AndroidFindBy (id = "tvAgain")
    private WebElement anotherSmsButton;

    @AndroidFindBy (xpath = "tvAuthorize")
    private WebElement validateButton;

    @AndroidFindBy (id = "button1")
    private WebElement okButton;

    public NumberValidationScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
