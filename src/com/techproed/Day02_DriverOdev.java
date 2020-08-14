package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {

        // driver'ımızı ekranı kaplayacak şekilde kullanalım.
        // 1 - ilk önce google.com'a gidelim.
        // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
        // 3 - daha sonra youtube.com'a gidelim.
        // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        // 6 - driver'ımızı kapatalım.

        System.setProperty("webdriver.chrome.driver" , "C:/Users/fidan/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        String titleGoogle = webDriver.getTitle();
        System.out.println(titleGoogle);

        webDriver.navigate().to("http://youtube.com");

        String titleYoutube = webDriver.getTitle();
        String urlYoutube = webDriver.getCurrentUrl();
        System.out.println(titleYoutube);
        System.out.println(urlYoutube);

        webDriver.navigate().back();
        String urlGoogle = webDriver.getCurrentUrl();
        System.out.println(urlGoogle);

        webDriver.quit();





    }
}
