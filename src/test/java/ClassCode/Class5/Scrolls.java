package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolls {

    @Test
    public void scrolls() {


        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * Use javascript to scroll
         *
         * scroll by pixel
         * scroll upto a webElement
         */

        /**
         * scroll by pixel
         *
         * scrollBy(0,500);
         */
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        // type-casting -> changing the driver-datatype into JavascriptExecutor
//        // and storing the result in JavascriptExecutor variable.
//        js.executeScript("scrollBy(0,500);");   // scroll downward 500 pixels
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        js.executeScript("scrollBy(0,-500);");   // scroll upward 500 pixels


        /**
         * Scroll upto a WebElement
         *
         * "elem.scrollIntoView(true);"
         */
//        WebElement element = driver.findElement(By.id(""));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", element);

        /**
         * Scroll upto bottom
         *
         * "window.scrollTo(0,document.body.scrollHeight);"
         *
         */
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");






    }


}
