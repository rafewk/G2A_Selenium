package com.G2A.tests;

import com.G2A.utils.Browsers;
import com.G2A.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.getDriver(Browsers.FIREFOX);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.g2a.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
