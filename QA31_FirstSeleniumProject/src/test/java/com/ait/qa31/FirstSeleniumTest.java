package com.ait.qa31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
  // before - setUp
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com"); // opens browser without story
        //driver.navigate().to("https://www.google.com");  opens browser with story
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
  // tests
    @Test
    public void openGoogleTest(){
        System.out.println("Google opened!");
    }
  // after - tearDown
    @AfterMethod
    public void tearDown(){
        //driver.close();  close one tab (if one tab -> close browser)
        driver.quit(); // close all tabs and browser
    }
}
