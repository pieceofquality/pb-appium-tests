package com.pinbonus.appium.tests;

import com.pinbonus.appium.screen.CardListScreen;
import com.pinbonus.appium.screen.WelcomeScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WelcomeTest extends TestBase{

    private WelcomeScreen wc;
    private CardListScreen cl;

    @Test
    public void startScreen(){
        Assert.assertEquals(wc.isWelcomeScreenDisplayed(), true);
        ();
        wc.startButton.click();
    }
}