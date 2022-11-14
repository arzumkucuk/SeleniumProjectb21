package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.Browser_Utilities;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {

    @Test
    public void simple_google_search_test(){
        // go to google.com
        /*
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

         */
        String url = ConfigurationReader.getProperty("googleUrl");
        Driver.getDriver().get(url);

        // Search for a value
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        String searchvalue = ConfigurationReader.getProperty("searchValue");

        searchBox.sendKeys(searchvalue+ Keys.ENTER);

        // Assert title contains the value

        //actual ==> actual page, browser
        String actualTitle = Driver.getDriver().getTitle();

        // expected ==> comes from documentation
        String expectedInTitle = searchvalue;

        // we are adding  2 seconds
        Browser_Utilities.sleep(4);
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedInTitle = " + expectedInTitle);

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        // calling the custom
        Driver.closeDriver();




    }
}
