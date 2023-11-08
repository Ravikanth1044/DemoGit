package com.base;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    public static void url(WebDriver driver,String value){
        driver.get(value);

    }
}
