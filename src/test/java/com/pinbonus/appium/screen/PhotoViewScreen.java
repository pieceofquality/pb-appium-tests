package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PhotoViewScreen {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    @AndroidFindBy(accessibility = "radioButton")
    private WebElement radioButton;

    @AndroidFindBy(accessibility = "radioButton2")
    private WebElement radioButton2;

    public PhotoViewScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
