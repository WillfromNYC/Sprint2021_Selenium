package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowns {

    @Test
    public void dropdown() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.linkText("Create New Account")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By monthLocator = By.id("month");
        WebElement monthDropdown = driver.findElement(monthLocator);
        Select month = new Select(monthDropdown);
        month.selectByVisibleText("Nov");

        /**
         * Dropdown with select tag --> Select class
         *
         * 1. find the locator of dropdown webElement
         * 2. find the dropdown-webElement using the step-1 locator
         * 3. Create an Object of Select class // Select s = new Select(step2WebElement);
         * 4. Use relevant method from Select class to select desired value in dropdown
         *      selectByVisibleText | selectByValue | selectByIndex
         */

        WebElement dateDropdown = driver.findElement(By.id("day"));
        Select day = new Select(dateDropdown);
        day.selectByValue("1");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select year = new Select(yearDropdown);
        year.selectByIndex(4);      // 2017




    }
}
