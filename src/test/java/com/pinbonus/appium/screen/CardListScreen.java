package com.pinbonus.appium.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CardListScreen {

    private AppiumDriver driver;

    @AndroidFindBy(id = "fabAdd")
    private WebElement addButton;

    @AndroidFindBy(id = "action_sort")
    private WebElement sortButton;

    @AndroidFindBy(id = "action_search")
    private WebElement searchButton;

    @AndroidFindBy(id = "bb1No")
    private WebElement bannerNoButton;

    @AndroidFindBy(id = "bb1yes")
    private WebElement bannerYesButton;

    @AndroidFindBy(id = "tvBrandName")
    private WebElement brandName;

    @AndroidFindBy(id = "tvComment")
    private WebElement commentText;

    @AndroidFindBy(id = "ivNotSync")
    private WebElement notSyncLabel;

    @AndroidFindBy(id = "ivBarcodeMark")
    private WebElement barcodeLabel;

    @AndroidFindBy(id = "ivMagstripeMark")
    private WebElement magstripeLabel;

    @AndroidFindBy(id = "search_src_text")
    private WebElement searchTextField;

    @AndroidFindBy(accessibility = "Collapse")
    private WebElement backButton;

    @AndroidFindBy(accessibility = "More Options")
    private WebElement optionsButton;

    //    @Step ("Check that first card list screen is displayed")
    public boolean isCardListScreenDisplayed(){return addButton.isDisplayed();}

    public CardListScreen(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20,
                TimeUnit.SECONDS), this);
    }
}
