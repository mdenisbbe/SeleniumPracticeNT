package practise01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C02_HelloSeleniumEdge {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver1=new EdgeDriver();
        driver1.get("https://selenium.dev");
        Thread.sleep(3000);
        driver1.quit();


        WebDriver driver2=new FirefoxDriver();
        driver1.get("https://selenium.dev");
        Thread.sleep(3000);
        driver1.quit();

    }
}
