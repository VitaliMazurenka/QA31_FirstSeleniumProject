package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CreateAccountTests extends TestBase {
    @Test
    public void createNewAccountPositiveTest(){
        driver.findElement(By.cssSelector("[href='/login']")).click();
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("vovka@mail.com");

        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Vovka123!");

        driver.findElement(By.xpath("//*[.='Log in')]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//*[.='Log in')]")));


    }




}
