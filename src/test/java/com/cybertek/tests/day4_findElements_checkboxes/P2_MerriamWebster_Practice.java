package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2_MerriamWebster_Practice {

    public static void main(String[] args) {

        //1. Open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://www.merriam-webster.com/
        driver.get("http://www.merriam-webster.com/");
        driver.manage().window().maximize();

        // implicit wait used by findElement method  to have additional time when not able to find
        // element immediately
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //3. print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithText =0;
        int linkdwithoutText = 0;

        for (WebElement eachLink : allLinks){

            String textOfEachLink = eachLink.getText();
            System.out.println(textOfEachLink);

            if (textOfEachLink.isEmpty()){
                linkdwithoutText++;
            }else {
                linksWithText++;
            }

            System.out.println(eachLink.getText());
        }

        //4- Print out how many links is missing text
        System.out.println("linkdwithoutText = " + linkdwithoutText);

        //5. print out how many link has text
        System.out.println("linksWithText = " + linksWithText);

        //6. print out how many total link
        int numberOflinks = allLinks.size();

        System.out.println("numberOflinks = " + numberOflinks);

        driver.close();


    }
}
