package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CardScreen {

    private AppiumDriver driver;


    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    @AndroidFindBy(accessibility = "More Options")
    private WebElement optionsButton;

    @AndroidFindBy(accessibility = "action_photos")
    private WebElement photosButton;

    @AndroidFindBy(accessibility = "ivBarCode")
    private WebElement barcodeImage;

    @AndroidFindBy(accessibility = "tvBarcodeNumberMan")
    private WebElement barcodeGenWarning;

    @AndroidFindBy(accessibility = "tvCardBarcode")
    private WebElement barcodeNumber;

    @AndroidFindBy(accessibility = "tvCardNumber")
    private WebElement cardNumber;

    @AndroidFindBy(accessibility = "etNotes")
    private WebElement notesField;

    public CardScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
