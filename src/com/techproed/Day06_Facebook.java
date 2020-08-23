package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/fidan/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        // 1. Adim
        // email kutusuna techproed@gmail.com yazdiralim.

        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        // 2. Adim
        // sifre kutusuna Test1234 yazdiralim.
        WebElement sifreKutusu = driver.findElement(By.xpath("//*[@type='password']"));
        sifreKutusu.sendKeys("Test1234");

        // 3. Adim
        // login butonunu bu
        WebElement loginButonu = driver.findElement(By.xpath("//button"));
        loginButonu.click();

        // Burada java 3000 milisaniye (3 saniye) bekleyecek
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        // https://www.facebook.com/login/

        String url = driver.getCurrentUrl();
        System.out.println(url);

        if(url.contains("facebook.com/login/")) {
            System.out.println("Giris Basarisiz !");
        }else {
            System.out.println("Giris Basarili !");
        }

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();





    }
}
