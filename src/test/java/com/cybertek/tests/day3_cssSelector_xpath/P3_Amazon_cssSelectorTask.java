package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelectorTask {

    public static void main(String[] args) {

        // 1. Open Chrome browser
        // Using our utulity to do SETUP + open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        // 3. Enter search term (use cssselector to locate search box)

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"']"));
        // tagname[attribute = 'value']

        amazonSearchBar.sendKeys("apple"+ Keys.ENTER);

        // 4. Verify title contains search term

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title contains search key. Verification PASSED!");
        }else {
            System.out.println("Title does nOT contain search key. Verificatn FAILED!!!");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedInTitle = " + expectedInTitle);
        }




    }
}
