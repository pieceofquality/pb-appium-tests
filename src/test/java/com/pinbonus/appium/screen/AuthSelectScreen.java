package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AuthSelectScreen {

    private AppiumDriver driver;

    @AndroidFindBy(id = "tvAuthorizeFacebook")
    private WebElement authFBButton;

    @AndroidFindBy(id = "tvNext")
    private WebElement laterButton;

    @AndroidFindBy (id = "tvAuthorize")
    private WebElement authPhoneButton;

    public AuthSelectScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
