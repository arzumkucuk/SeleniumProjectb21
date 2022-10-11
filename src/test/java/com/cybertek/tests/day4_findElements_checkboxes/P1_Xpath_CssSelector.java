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
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        // c. "E-mail" text
        WebElement emaillabel = driver.findElement(By.xpath("//label[@for='email']"));

        //TODO: CHANGE THIS LOCATOR ASAP
        //Locating the label using its TEXT with XPATH
        //WebElement email = driver.findElement(By.xpath("//label[.='E-mail']"));


        // d. E-mail input box
        //Using syntax #1, tagName[attribute='value']
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));

        //option #2: Using "name" attribute to locate the same web element
       // WebElement emailInputbox = driver.findElement(By.cssSelector("input[name='email']"));

        // e. "retrieve password" button
        // Locating the button using #2 cssSelector syntax.
        // tagName.classValue
        // tagName#idValue

        // locating using class  value
        WebElement retrievePasswordbutton = driver.findElement(By.cssSelector("button.radius"));


        // f. "Powered by Cybertek School" text
        WebElement footerText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all WebElements are displayed.

        if (homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed() && emaillabel.isDisplayed()
        && emailInputBox.isDisplayed() && retrievePasswordbutton.isDisplayed() && footerText.isDisplayed() ){
            System.out.println("ALL WEB ELEMENTS ARE DISPLAYED. VERIFICATION PASSED!");
        }else {
            System.out.println("One or more of the web elements are not displayed. Verification FAILED!!!");
        }

        driver.close();




    }
}
