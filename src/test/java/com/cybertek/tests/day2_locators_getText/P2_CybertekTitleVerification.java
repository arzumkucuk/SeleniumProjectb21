package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekTitleVerification {

    public static void main(String[] args) {

        //#2 cybertek vrificactions
        // 1. Open Chrome browser
        // stup my driver
        WebDriverManager.chromedriver().setup();
        // open browser
        WebDriver driver = new ChromeDriver();
        // 2. Go to https://practice.cybertekschool.com
        driver.get("https://practice.cybertekschool.com");

        //3. Verify URL contains
        //Expected: cybertekschool
        String expectedInURL = "cybertekschool";
        String actualInURL = driver.getCurrentUrl();

        System.out.println("expected URL= "+expectedInURL);
        System.out.println("actual URL= "+actualInURL);

        if (actualInURL.contains(expectedInURL) ){
            System.out.println("URL verification PASSED!");
        }else{
            System.err.println("URL verification FAILED!!!");
        }

        // 4. verify title:
        // expected: practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualInURL.equalsIgnoreCase(expectedInURL)){
            System.out.println("Title verification PASSED!");

        }else {
            System.out.println("Title verification FAILED!");
        }

        driver.close();






    }
}
