package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Apple {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://apple.com");

       // WebElement store = driver.findElement(By.xpath("//a[.='Buy']"));
        WebElement store = driver.findElement(By.name("store"));

        store.click();

        driver.close();



    }
}
