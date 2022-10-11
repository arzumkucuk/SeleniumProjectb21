package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FacebookTitleVerification {

    public static void main(String[] args) {

        //TC #1: Facebook title verification
        // 1. Open chrome browser
        // Setup the browser driver
        WebDriverManager.chromedriver().setup();

        // Use WebDriver instance to open the browser
        // This is the line that is opening the browser we select
        WebDriver driver = new ChromeDriver();

        // 2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3. verify title:
        // Expected: Facebook - Log In or Sign Up
        // Actual: We need to get from browser using selenium

        String expectedTitle = "Facebook - Log in or Sign up";

        String actualTitle = driver.getTitle();

        // doing verification by creating simple if condition below:

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("TITLE VERIFICATION FAILED!!!");
        }

        driver.close();









    }
}
