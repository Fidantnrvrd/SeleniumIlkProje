package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        // Java projemize, chromedriver'i tanıttık.
        System.setProperty("webdriver.chrome.driver" , "C:/Users/fidan/Documents/selenium dependencies/drivers/chromedriver.exe");

        // selenium ile ilgili ilk kodumuz.
        // webDriver nesnesi olusturarak, chrome driveri kullanabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();

        // driver'ımıza google.com'a gitmesini soyledik.
        webDriver.get("http://google.com");

        // driver'ımızda acik olan pencereyi kapatir.
        // webDriver.close();

        // driver'imizi komple kapatir.
        webDriver.quit();




    }
}
