package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/fidan/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        String amazonTitle = driver.getTitle();// Books

        // contains methodu, bir yazinin icerisinde bir kelime grubunun gecip gecmedigini kontrol eder.
        if( amazonTitle.contains("Books") ){
            System.out.println("Books kelimesini iceriyor.");
        }else{
            System.out.println("Books kelimesini icermiyor.");
        }
        driver.quit();

    }
}
