package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InitDriver
{

    private static WebDriver objDriver;

    public static WebDriver setUpDriver()
    {
        System.setProperty("webdriver.chrome.driver","C://Users//7200//Downloads//chromedriver_win32/chromedriver.exe");
        objDriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.logfile", "C://chromedriver.log");
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        objDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return objDriver;
    }

}
