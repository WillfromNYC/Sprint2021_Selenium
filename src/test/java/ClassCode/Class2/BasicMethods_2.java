package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicMethods_2 {

    @Test
    public void basicMethods2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        /**
         * To move back and forward
         *
         * method: back()
         *
         * method: forward()
         *
         */

        Thread.sleep(5000);

        driver.navigate().back();       // <-- to go back once

        Thread.sleep(5000);

        driver.navigate().forward();    // <-- to go forward once

        /**
         * To refresh the webpage
         *
         * 1. Method: navigate().refresh()
         *
         * 2. launch the current url
         *
         * 3. go back and then forward
         *
         */
        // 1
        driver.navigate().refresh();

        // 2
            /*
                get the current url using -> getCurrentUrl()
                launch the result of step-1 with get()
            */
        String currentUrl = driver.getCurrentUrl();
        driver.get(currentUrl);

        // 3
        driver.navigate().back();
        driver.navigate().forward();


    }

}
