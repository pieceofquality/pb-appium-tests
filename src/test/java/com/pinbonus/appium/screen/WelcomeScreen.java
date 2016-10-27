package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class WelcomeScreen {
    private AppiumDriver driver;
    TouchAction action;

    @AndroidFindBy (id = "ivPromoPhoto")
    private WebElement promoPhoto;

    @AndroidFindBy (id = "tvPromoText")
    private WebElement promoText;

    @AndroidFindBy (id = "bStart")
    public WebElement startButton;

    public WelcomeScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }

//    @Step ("Check that first welcome screen is displayed")
    public boolean isWelcomeScreenDisplayed(){return promoPhoto.isDisplayed();}

//    @Step("Swipe")
    public void swipe(){
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.1);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 500);
    }
}