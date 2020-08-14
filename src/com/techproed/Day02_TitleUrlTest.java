package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/fidan/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println(youtubeTitle);

        if(youtubeTitle.contains("Video")) {
            System.out.println("video kelimesi iceriyor");
        }else {
            System.out.println("video kelimesi icermiyor");
        }
        driver.quit();

    }
}
