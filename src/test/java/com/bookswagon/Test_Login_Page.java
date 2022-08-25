package com.bookswagon;

import com.bookswagon.base.BaseClass;
import com.bookswagon.pages.Home;
import com.bookswagon.pages.Login;
import com.bookswagon.pages.Products;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Login_Page extends BaseClass {

    @Test
    public void loginIntoApplication_WithValid_Credentials() {
        Login login = new Login(driver);
        boolean title = login.login();

        Assert.assertTrue(title);
    }

    @Test(priority = 1)
    public void search_For_Book() {
        Home home = new Home(driver);
        home.search();
    }

    @Test(priority = 2)
    public void check_BookDetails() {
        Products products  = new Products(driver);
        boolean displayed = products.openProduct();

        Assert.assertTrue(displayed);
    }

    @Test(priority = 3)
    public void addBook_To_Cart() {
        Products products = new Products(driver);
        boolean displayed = products.addToCart();

        Assert.assertTrue(displayed);
    }
}
