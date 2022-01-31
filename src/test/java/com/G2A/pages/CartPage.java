package com.G2A.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(xpath = "//header//h1[@class='indexes__Header-sc-22h3k7-2 jgDqmC']")
    private WebElement cartHeader;

    @FindBy(xpath = "//h3[@class='indexes__TitleStyle-sc-1bnmqae-208 krbJwg']")
    private WebElement productInCartNameHeader;

    @FindBy(xpath = "//button[@data-test-id='custom']")
    private WebElement productAmountBtn;

    @FindBy(xpath = "//li//span[text()='2']")  //---------- amount hardcoded as 2, change it later
    private WebElement pickAmountDropDown;

    @FindBy(xpath = "//button[@data-test-id='custom']//span")
    private WebElement productAmountSpan;

    @FindBy(xpath = "//h3[contains(text(),'Your cart is empty.')]")
    private WebElement emptyCartHeader;

    @FindBy(xpath = "//svg[@xmlns='http://www.w3.org/2000/svg']") //-------- to change
    private WebElement deleteProductBtn;

//*************************************************************

    private final WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//*************************************************************

    public CartPage changeProductAmount() {
        productAmountBtn.click();
        pickAmountDropDown.click();
        return new CartPage(driver);
    }

    public WebElement getProductInCartNameHeader() {
        return productInCartNameHeader;
    }

    public CartPage deleteProductFromCart() {
        deleteProductBtn.click();
        return new CartPage(driver);
    }

    public WebElement getEmptyCartHeader() {
        return emptyCartHeader;
    }

    public WebElement getProductAmountSpan() {
        return productAmountSpan;
    }
}
