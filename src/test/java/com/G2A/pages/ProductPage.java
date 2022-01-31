package com.G2A.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(xpath = "//button[@data-locator='ppa-payment__btn' and text()='Add to cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//h1[@data-locator='ppa-summary__title']")
    public static WebElement productName;

//*************************************************************

    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//*************************************************************

    public CartPage addProductToCart() {
        addToCartBtn.click();
        return new CartPage(driver);
    }

}
