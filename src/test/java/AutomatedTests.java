//package test.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTests {

    @Test
    public void TestCase() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amocrm.ru/");
        driver.findElement(By.id("main-menu_button")).click();
        var actualResult = driver.findElement(By.className("main-menu_button")).isDisplayed();
        Assert.assertTrue(actualResult);
        driver.quit();
    }

    @Test
    public void TestCase2() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amocrm.ru/");
        driver.findElement(By.id("main-menu_button")).click();
        driver.findElement(By.className("main-menu__header_link")).click();
        var actualResult = driver.findElement(By.className("main-menu__header_link")).isDisplayed();
        Assert.assertTrue(actualResult);
        driver.quit();
    }

    @Test
    public void TestCase3() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amocrm.ru/");
        driver.findElement(By.id("main-menu_button")).click();
        driver.findElement(By.cssSelector(".main-menu__header_link[href='/tour/']")).click();
        Assert.assertEquals("https://www.amocrm.ru/tour/", driver.getCurrentUrl());
        driver.quit();
    }

    @Test
    public void TestCase4() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amocrm.ru/");
        driver.findElement(By.id("main-menu_button")).click();
        driver.findElement(By.cssSelector(".main-menu__header_link[href='/buy/']")).click();
        driver.quit();
    }

    @Test
    public void TestCase5() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amocrm.ru/");
        driver.findElement(By.id("main-menu_button")).click();
        driver.findElement(By.cssSelector(".main-menu__header_link[href='/customers/']")).click();
        driver.quit();
    }

    @Test
    public void TestCase6() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amocrm.ru/");
        driver.findElement(By.id("main-menu_button")).click();
        driver.findElement(By.cssSelector(".main-menu__header_link[href='/cases/']")).click();
        driver.quit();
    }

    @Test
    public void testCase7() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amocrm.ru/");
        driver.findElement(By.className("page_header__auth__trial_link")).click();
        driver.findElement(By.name("signup[data][user_name]")).sendKeys("karina.kgmail.com ");
        driver.findElement(By.name("signup[data][first_name]")).sendKeys("Карина");
        driver.findElement(By.name("signup[data][phone_num_unformated]")).sendKeys("912 345-87-67");
        driver.findElement(By.id("try_now__button_submit")).click();
        var actualResult = driver.findElement(By.cssSelector(".new_try_now__block.field.invalid_field[data-type=\"email\"]")).isDisplayed();
        Assert.assertTrue(actualResult);
        driver.quit();
    }
}
