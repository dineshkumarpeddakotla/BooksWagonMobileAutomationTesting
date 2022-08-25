package com.bookswagon.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "shannu");
        cap.setCapability("udid", "A2QDU17616022345");
        cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(CapabilityType.VERSION, "8.0.0");
        cap.setCapability("appPackage", "com.bookswagon");
        cap.setCapability("appActivity", "com.bookswagon.splash.SplashActivity");
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<>(url, cap);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @AfterTest
    public void tearDown() {
        driver.closeApp();
    }
}
