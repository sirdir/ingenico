package com.ingenico.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver != null) {
            return driver;
        }

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        if ("true".equals(System.getProperty("headless"))) {
            chromeOptions.setHeadless(true);
        }

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        return driver;
    }

    public static void stopDriver() {
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        try {
            driver.quit();
        }
        finally {
            driver = null;
        }

    }

}
