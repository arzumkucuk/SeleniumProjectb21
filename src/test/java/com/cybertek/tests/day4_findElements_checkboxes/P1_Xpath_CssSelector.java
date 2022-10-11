package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Xpath_CssSelector {

    public static void main(String[] args) {

        // TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // 3. Locate all the WebElement on the page using XPATH and/or CSS locator only(total of 6)

        // a. "Home" link
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));

        //Locating the same link using class attribute's value
        //WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //Locating the same link using href attribute's value
        //WebElement homeLink = driver.findElement(By.xpath("//a[@href='/']"));

        // b. "Forgot password" header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath(""));

        // c. "E-mail" text
        WebElement emaillabel = driver.findElement(By.xpath("//label[@for='email']"));

        //TODO: CHANGE THIS LOCATOR ASAP
        //Locating the label using its TEXT with XPATH
        //WebElement email = driver.findElement(By.xpath("//label[.='E-mail']"));


        // d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        // e. "retieve password" button
        // f. "Powered by Cybertek School" text
        // 4. Verify all WebElements are displayed.




    }
}
