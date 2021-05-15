package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Kickoff {

    @Test
    public void launchWebPage() {
        // path of driver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver"); //(program to initiate, file location)

        WebDriver driver = new ChromeDriver();
        /**
         * WebDriver driver --> driver is a variable of WebDriver type.
         * new ChromeDriver() --> creating an object of ChromeDriver class
         *
         * Storing the object of ChromeDriver class into WebDriver variable.
         *
         * ChromeDriver(C) extends RemoteWebDriver(C) ; RemoteWebDriver(C) implements WebDriver(I)
         *
         */

        /**
         * To launch a webpage
         *
         * Method 1 : get()
         *
         * Method 2 : navigate().to()
         *
         */
        String url = "https://www.facebook.com/";
        driver.get(url);
        // OR
        // driver.navigate().to("https://www.facebook.com");

        /**
         * get() vs navigate().to()
         *
         * get() -> launches the webpage and waits for few seconds (for webpage to load) before going to the next commands
         *
         * navigate().to() -> launches the webpage,
         *  and goes to the net command. (does NOT wait for webpage to load)
         */

        /**
         * To maximize the webpage
         *
         * Method: maximize()
         */
        // driver.manage().window().maximize();

        /**
         * To get Page Title of window associated with driver
         *
         * Method: getTitle()
         *
         */
        String pageTitle = driver.getTitle();
        String expPageTitle = "Facebook – log in or sign up";

        /*
            To assert while ignoring cases
         */
        Assert.assertEquals(pageTitle.toLowerCase(), expPageTitle.toLowerCase(), "Page title is not equal after ignoring cases");
            // OR
        Assert.assertTrue(pageTitle.equalsIgnoreCase(expPageTitle), "Page title is not equal after ignoring cases");

        Assert.assertEquals(pageTitle, expPageTitle, "Page title is not appearing as expected");
        /**
         * Assert class contains multiple methods, which we can use to implement the verification.
         * assertEquals - When we need to verify actualValue against expectedValue
         *      Sample: Assert.assertEquals(value1, value2, "This Error msg will print if Assertion fails");
         *
         * assertTrue - When we need to verify if the boolean value is true
         *      Sample: Assert.assertTrue(booleanValue, "This Error msg will print if Assertion fails");
         *
         * assertFalse - When we need to verify if the boolean value is false
         *      Sample: Assert.assertFalse(booleanValue, "This Error msg will print if Assertion fails");
         */

        /**
         * To get the url of window associated with driver
         *
         * method: getCurrentUrl()
         */
        String pageUrl = driver.getCurrentUrl();
        Assert.assertEquals(url, pageUrl, "Page url is not as expected");


        /**
         * To close a webpage
         *
         * Method 1: close()
         *          will close only the web-window associated with driver
         * method 2: quit()
         *          will close ALL web-windows opened dur to automation code/script
         */
        // driver.close();
        driver.quit();



    }



}
