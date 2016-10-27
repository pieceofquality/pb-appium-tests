package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CardListSelectScreen {

    private AppiumDriver driver;

    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;

    @AndroidFindBy(id = "action_search")
    private WebElement searchButton;

    @AndroidFindBy(id = "action_region")
    private WebElement regionButton;

    @AndroidFindBy(id = "bb1yes")
    private WebElement bannerYesButton;

    @AndroidFindBy(id = "llPhotoBar")
    private WebElement addOtherCardButton;


    public CardListSelectScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
