package com.G2A.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GryWideoPage {

    @FindBy(xpath = "//ul[@class='GridContent_section-content--grid__3BOJd RegularProductsContent_products-content--regular__wrap__TsU3B']//img")
    private List<WebElement> productsImages;

//*************************************************************

    private final WebDriver driver;

    public GryWideoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//*************************************************************

    public ProductPage openProductPage() {
        productsImages.get(1).click();
        return new ProductPage(driver);
    }
}
