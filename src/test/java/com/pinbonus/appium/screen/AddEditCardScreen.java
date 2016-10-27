package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AddEditCardScreen {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    @AndroidFindBy(id = "action_save")
    private WebElement saveButton;

    @AndroidFindBy(id = "etBrand")
    private WebElement brandField;

    @AndroidFindBy(id = "etMagStripe")
    private WebElement magField;

    @AndroidFindBy(id = "etBarcode")
    private WebElement barcodeField;

    @AndroidFindBy(id = "ivRemoveBarcode")
    private WebElement barcodeRemove;

    @AndroidFindBy (id = "etNumber")
    private WebElement numberField;

    @AndroidFindBy (id = "ivRemoveNumber")
    private WebElement removeNumber;

    @AndroidFindBy (id = "ivCardFront")
    private WebElement photoFrontButton;

    @AndroidFindBy (id = "ivCardFrontCamera")
    private WebElement photoFrontReplaceButton;

    @AndroidFindBy (id = "ivCardRemove")
    private WebElement photoFrontRemoveButton;

    @AndroidFindBy (id = "ivCardBack")
    private WebElement photoBackButton;

    @AndroidFindBy (id = "ivCardBackRemove")
    private WebElement photoBackREmoveButton;

    @AndroidFindBy (id = "ivCardBackCamera")
    private WebElement photoBackReplaceButton;

    @AndroidFindBy (id = "etComment")
    private WebElement commentField;

    @AndroidFindBy (id = "ivRemoveComment")
    private WebElement removeCommentButton;

    public AddEditCardScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }

}