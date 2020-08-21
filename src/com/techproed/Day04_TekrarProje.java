package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_TekrarProje {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/fidan/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com");

        // name kullanarak arama satirina "computer" yazdiralim

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("computer");
        search.submit();

        WebElement gorseller = driver.findElement(By.partialLinkText("Görseller"));
        gorseller.click();



    }

}
