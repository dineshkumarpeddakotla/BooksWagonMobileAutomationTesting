package com.bookswagon.pages;

import com.bookswagon.base.BaseClass;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Home extends BaseClass {

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView'and@text='Search By Keyword']")
    MobileElement searchBoxIcon;
    @AndroidFindBy(id = "com.bookswagon:id/edt_search")
    MobileElement searchTextBox;
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView'and@text='Product List']")
    MobileElement productList;

    public Home(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void search() {
        searchBoxIcon.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchTextBox.sendKeys("Core Python Applications Programming");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println(productList.isDisplayed());
    }
}
