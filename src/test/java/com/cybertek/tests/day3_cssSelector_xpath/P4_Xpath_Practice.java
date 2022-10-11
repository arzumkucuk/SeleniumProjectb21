package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_Xpath_Practice {

    public static void main(String[] args) throws InterruptedException {

        // go to this link: http://practice/cybertekschool.com/multiple_buttons

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // locate button2 USING XPATH LOCATOR

        WebElement button2 = driver.findElement(By.xpath("//button[.='Button 2']")); // nokta esittir text almak icin

        button2.click();

        Thread.sleep(5000);

        driver.close();
        /*
        Interview sorusu
        -> How many diffirent types of XPATH locators are there?
        - There are 2 types of XPATH.

        #1 - Absolute Xpath
            - Absolute xpath starts with single slash "/"
            - Which means absolute xpath starts from the root element (html)
            - It goes 1 by 1 from parent to child until we reach to the desired web element.
            - Not recommended to USE
            - It will break if there is any slight change in the web element structure.

            /html/body/div/div/div/h2

        #2 - Relative Xpath

            - Relative xpath starts with doublle slash "//"
            - Double slash means we can start from anywhere in the page.
            - It is a lot more reliable than absolute xpath because we are being a specific.
            - We can locate a parent and go to child.
            - We can locate a child and go to parent with xpath.

    Common relative xpath locators:
        #1- // tagName[@attribute='value']




         */
    }

}


