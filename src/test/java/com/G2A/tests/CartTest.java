package com.G2A.tests;

import com.G2A.pages.HomePage;
import com.G2A.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCart() {
        String productInCart = new HomePage(driver)
                .openGryWidePage()
                .openProductPage()
                .addProductToCart()
                .getProductInCartNameHeader().getText();

        Assert.assertEquals(productInCart, ProductPage.productName.getText());
    }

    @Test
    public void deleteFromCart() {
        String emptyCartMsg = new HomePage(driver)
                .openGryWidePage()
                .openProductPage()
                .addProductToCart()
                .deleteProductFromCart()
                .getEmptyCartHeader().getText();

        Assert.assertTrue(emptyCartMsg.contains("Your cart is empty."));
    }

    @Test
    public void changeProductAmountInCart() {
        String productAmount = new HomePage(driver)
                .openGryWidePage()
                .openProductPage()
                .addProductToCart()
                .changeProductAmount()
                .getProductAmountSpan().getText();

        Assert.assertEquals(productAmount, "2");
    }
}
