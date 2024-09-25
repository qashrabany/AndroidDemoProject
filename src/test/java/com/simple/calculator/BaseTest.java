package com.simple.calculator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest{
    AndroidDriver driver;
    @BeforeClass
    public void setUpAppium(){
        try{
        DesiredCapabilities capabilities  = new DesiredCapabilities();
        capabilities.setCapability("udid", "ce041714a3474a2005");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.bng.calculator");
        capabilities.setCapability("appActivity", "com.bng.calc.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");


            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }
    @AfterClass
    public void tearDown(){

    }
}
