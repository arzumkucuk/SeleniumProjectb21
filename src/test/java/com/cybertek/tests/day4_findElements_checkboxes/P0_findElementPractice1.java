package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_findElementPractice1 {
    public static void main(String[] args) {

        //#1- Open chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //#2 - go to: http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //#3- Locate all of the LINKS on the page, and print out all the texts
              // first we need to find the locator that is returning us all of the links in the page
                // body//a
              // second, store all of the links in to a list of WebElements

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

              // third, create java logic to print out all of the texts of all links

        for (WebElement eachlink : listOfLinks){

            System.out.println(eachlink.getText());
        }

        //#4- Print out how many links on the page

        int numberOfLinks = listOfLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);

        driver.close();




    }
}
