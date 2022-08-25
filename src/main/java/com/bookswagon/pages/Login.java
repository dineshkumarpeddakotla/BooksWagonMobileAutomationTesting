package com.bookswagon.pages;

import com.bookswagon.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login extends BaseClass {

    @AndroidFindBy(id = "com.bookswagon:id/etEmail")
    MobileElement email;
    @AndroidFindBy(id = "com.bookswagon:id/etPassword")
    MobileElement password;
    @AndroidFindBy(id = "com.bookswagon:id/loginbypassword")
    MobileElement loginButton;
    @AndroidFindBy(id = "com.bookswagon:id/tv_header")
    MobileElement home;
    public Login(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean login() {
        email.sendKeys("dinesh151270@gmail.com");
        password.sendKeys("Dinnu@247");
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return home.isDisplayed();
    }
}
