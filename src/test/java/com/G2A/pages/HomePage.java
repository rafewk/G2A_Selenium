package com.G2A.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//a[@href='/department/gaming']//span[text()='Gry wideo']")
    private WebElement gryWideoLink;

//*************************************************************

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//*************************************************************

    public GryWideoPage openGryWidePage() {
        gryWideoLink.click();
        return new GryWideoPage(driver);
    }
}
