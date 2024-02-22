package com.ait.qa31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void findElementByCssSelectorTest() {
        //tag
        driver.findElement(By.cssSelector("img"));
        driver.findElement(By.cssSelector("p"));
        //#id
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#flyout-cart"));
        // .className
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".cart-label"));
        driver.findElement(By.cssSelector(".mini-shopping-cart"));

        // any  -> [attr='par']
        driver.findElement(By.cssSelector("[href='/login']"));
        driver.findElement(By.cssSelector("[href='/']"));
        driver.findElement(By.cssSelector("[href='/books']"));

    }

    @Test
    public void findElementByXpath() {
        //     //tagName
        driver.findElement(By.xpath("//img"));
        driver.findElement(By.xpath("//p"));
        //    //tag[@id='bar-notification']
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@id='flyout-cart']"));
        //    //tag[@class='class name']
        driver.findElement(By.xpath("//*[@class='header']"));
        driver.findElement(By.xpath("//*[@class='cart-label']"));
        driver.findElement(By.xpath("//*[@class='mini-shopping-cart']"));
        //any -> //*[@attr='par']
        driver.findElement(By.xpath("//*[@href='/login']"));
        driver.findElement(By.xpath("//*[@href='/']"));
        driver.findElement(By.xpath("//*[@href='/books']"));
        //by text
        driver.findElement(By.xpath("//*[.='Feel free to shop around and explore everything.']"));
        driver.findElement(By.xpath("//*[contains(.,'in your shopping cart.')]"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
