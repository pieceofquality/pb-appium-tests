package com.pinbonus.appium.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Dimension;

public class ScreenBase {

    public static AppiumDriver<MobileElement> driver;

    public ScreenBase(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void swipeRightToLeft(){
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.9);
        int endx = (int) (size.width * 0.1);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 500);
    }

    public void swipeLeftToRight(){
        Dimension size = driver.manage().window().getSize();
        int endx = (int) (size.width * 0.9);
        int startx = (int) (size.width * 0.1);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 500);
    }
}
