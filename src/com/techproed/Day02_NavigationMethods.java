package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        // Java projemize, chromedriver'i tanıttık.
        System.setProperty("webdriver.chrome.driver" , "C:/Users/fidan/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        //driver'in tum ekrani kaplamasini saglar.
        webDriver.manage().window().maximize();

        // driver'a google.com'a gitmesini soyledik.
        webDriver.get("http://google.com");

        // get komutu ile ayni islemi yapiyor.
        webDriver.navigate().to("http://amazon.com");

        // navigate().back() komutu bir onceki sayfaya geri donmeye yariyor.
        webDriver.navigate().back();

        //  navigate().forward() methodu geri geldigimiz sayfaya gitmemizi saglar.
        // ornek : google ==> amazona gittik ==> amazon'dan google'a geri geldik
        //eger forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();

        // navigate().refresh() methodu sayfayi yenilemeye yariyor.
        webDriver.navigate().refresh();
    }
}
