package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PhoneAuthScreen {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    @AndroidFindBy(id = "spCountry")
    private WebElement selectCountryPhoneButton;

    @AndroidFindBy (id = "etPhone")
    private WebElement phoneNumberField;

    @AndroidFindBy (id = "tvContinue")
    private WebElement continueButton;

    @AndroidFindBy (xpath = "button2")
    private WebElement fixNumberButton;

    @AndroidFindBy (id = "button1")
    private WebElement yesButton;

    public PhoneAuthScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
