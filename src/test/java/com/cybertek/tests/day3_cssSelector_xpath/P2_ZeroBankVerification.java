package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_ZeroBankVerification {

    public static void main(String[] args) {

        // TC #2: Zero Bank link text verification
        // 1. Open Chrome Browser
        // setup
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // open browser and create driver instance

        driver.manage().window().maximize();

        // 2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3. verify link text from top left:
        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        // Expected: "Zero Bank"
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if ((actualLinkText.equals(expectedLinkText))){
            System.out.println("Link TEXT verification PASSED!");
        }else{
            System.out.println("Link TEXT verification FAILED!!!");
            System.out.println("actualLinkText = "+actualLinkText);
            System.out.println("expectedLinkText = "+expectedLinkText);
        }

        // 4. Verify link href attribute value contains:
        // Expected: "index.html"

        String expectedInHref = "index.html";
        String actualInHref = zeroBankLink.getAttribute("href");

        System.out.println("actualInHref = " + actualInHref);
        System.out.println("expectedInHref = " + expectedInHref);

        if (actualInHref.contains(expectedInHref)){
            System.out.println("HREF verification PASSED!");
        }else {
            System.out.println("HREF verification FAILED!!!");
            System.out.println("actualInHref = " + actualInHref);
            System.out.println("expectedInHref = " + expectedInHref);
        }

        driver.close();
    }
}
