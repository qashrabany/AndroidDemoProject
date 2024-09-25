package com.simple.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleCalculatorTest extends BaseTest {
    @Test
    public void addShouldBeSucceed(){
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(),"27");

    }
    @Test
    public void subtractShouldBeSucceed(){
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("minus")).click();
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(),"4");

    }
    @Test

    public void multiplicationShouldBeSucceed(){
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("multi")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(),"27");

    }
    @Test
    public void divisionShouldBeSucceed(){
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("divi")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(),"3");

    }
}
