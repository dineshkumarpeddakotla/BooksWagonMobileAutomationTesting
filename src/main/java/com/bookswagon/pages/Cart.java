package com.bookswagon.pages;

import com.bookswagon.base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class Cart extends BaseClass {

    @AndroidFindBy(id = "com.bookswagon:id/integer_number")
    MobileElement quantity;
    @AndroidFindBy(id = "com.bookswagon:id/txt_grosstotal")
    MobileElement totalPrice;
    @AndroidFindBy(id = "com.bookswagon:id/tv_discountprice")
    MobileElement price;
    @AndroidFindBy(id = "com.bookswagon:id/btn_paynow")
    MobileElement placeOrder;
    @AndroidFindBy(id = "com.bookswagon:id/txt_recipient")
    MobileElement recipientName;
    @AndroidFindBy(id = "com.bookswagon:id/txtinput_streetdetail")
    MobileElement streetDetails;
    @AndroidFindBy(id = "com.bookswagon:id/txtinput_landmark")
    MobileElement landMark;
    @AndroidFindBy(id = "com.bookswagon:id/ccpp")
    MobileElement countryDropDown;
    @AndroidFindBy(id = "com.bookswagon:id/textView_countryName")
    List<MobileElement> countryName;
    @AndroidFindBy(id = "com.bookswagon:id/editText_search")
    MobileElement searchCountry;
    @AndroidFindBy(id = "com.bookswagon:id/txt_state")
    MobileElement stateDropDown;
    @AndroidFindBy(id = "com.bookswagon:id/searchBox")
    MobileElement stateSearchBox;
    @AndroidFindBy(id = "com.bookswagon:id/text1")
    MobileElement stateName;

}
