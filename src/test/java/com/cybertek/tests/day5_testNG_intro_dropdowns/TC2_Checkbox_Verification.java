package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2_Checkbox_Verification {

    public static void main(String[] args) {

        //1. open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //3. Verify "Succsess - Check box is checked" message is NOT diplayed.

        // optinon #1 : Using xpath and id attribute value to locate succsessMessage
        WebElement succsessMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));
        // option #2 : Using xPath and style attribute value: //div[@style='display:block;']
        // option #3 : Using xPath and text value: //div[.='Success - Check box is checked']
        // option #4 : Using xPath and text value: //div[text()='Success - Check box is checked']
        // option #5 : Using xPath and * instead of tagName : //*[@id="txtAge"]

        //Locating checkbox
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        if (!checkbox1.isSelected() && !succsessMessage.isDisplayed()){
            System.out.println("Checkbox is NOT selected. Message is NOT displayed. Verification PASS!");
        }else{
            System.out.println("FAIL!!!");
        }

        //4. CLick to checkbox under "Single Checkbox Demo" section.
        checkbox1.click();

        //5. Verify "Succsess - Check box is checked" message is displayed.

        if (checkbox1.isSelected() && succsessMessage.isDisplayed()){
            System.out.println("Checkbox is selected. Message is displayed. Verification PASS!");
        }else{
            System.out.println("FAIL!!!");
        }

        driver.close();




    }
}
