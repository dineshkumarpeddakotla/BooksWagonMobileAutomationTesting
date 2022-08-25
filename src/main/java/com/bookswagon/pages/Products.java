package com.bookswagon.pages;

import com.bookswagon.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class Products extends BaseClass {

    @AndroidFindBy(id = "com.bookswagon:id/title")
    List<MobileElement> products;
    @AndroidFindBy(id = "com.bookswagon:id/tv_header")
    MobileElement productDetails;
    @AndroidFindBy(id = "com.bookswagon:id/tv_addtocart")
    MobileElement addToCart;
    @AndroidFindBy(id = "com.bookswagon:id/snackbar_text")
    MobileElement itemAddToCart;

    public Products(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    boolean flag;

    public boolean openProduct() {
        flag = false;
        while (true) {
            for (MobileElement element : products) {
                if (element.getText().equals("Core Python Applications Programming")) {
                    element.click();
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            } else {
                scrollDown();
            }
        }

        return productDetails.isDisplayed();
    }

    public void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);
        TouchAction<AndroidTouchAction> action = new TouchAction<>(driver);
        action.press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

    public boolean addToCart() {
        addToCart.click();
        return itemAddToCart.isDisplayed();
    }
}
