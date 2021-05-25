package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_3_Practical {
    @Test
    public void practical() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String loginTag = "button";
        By loginLocator = By.tagName(loginTag);
        WebElement loginButton = driver.findElement(loginLocator);
        loginButton.click();

        String loginXpath = "//button[@type='submit']";
        By loginLocator2 = By.xpath(loginXpath);
        WebElement loginButton2 = driver.findElement(loginLocator2);
        loginButton2.click();


    }
}
