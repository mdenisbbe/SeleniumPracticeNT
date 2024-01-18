package practise01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_FirstTest {
    public static void main(String[] args) {

        //Ebay sitesi

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");

        //Sayfanın Title testini yapi, ttitle ekrana yazdır

        System.out.println("Title: "+driver.getTitle());

        //Electronics, Cars, Fashion, Collectibles & More | eBay

        String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test Passed");
        }else{
            System.err.println("Test Failed");
        }

        //Sayfanın URL testini yap. url ekrana yazdır
        String actualUrl="https://www.ebay.com/";
        String expectedUrl= driver.getCurrentUrl();

        System.out.println("Url: "+driver.getCurrentUrl());

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url Test Pass");
        }else {
            System.err.println("Url Test Fail");
        }
        //pagesource ekrana yazdır

       // System.out.println("Pagesource: "+ driver.getPageSource());


        driver.quit();


    }
}
