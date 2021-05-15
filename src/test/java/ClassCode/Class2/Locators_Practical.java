package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_Practical {
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

        // enter email as abcd@test.com
        String emailId = "email";
        By emailLocator = By.id(emailId);
        WebElement emailBox = driver.findElement(emailLocator);
        emailBox.sendKeys("abcd@test.com");

        // OR

        // driver.findElement(By.id("email")).sendKeys("abcd@test.com");


        // enter password as abcd@1234
        String passName = "pass";
        By passLocator = By.name(passName);
        WebElement passBox = driver.findElement(passLocator);
        passBox.sendKeys("abcd@1234");

        /*
        String passClass = "_6ltj";
        By passwordLocator_2 = By.className(passClass);
        WebElement passBox_2 = driver.findElement(passwordLocator_2);
        passBox_2.sendKeys("abcd@1234");
         */

        String createAccountText = "Create New Account";
        By accountTextLocator = By.linkText(createAccountText);
        WebElement createAccountButton = driver.findElement(accountTextLocator);
        createAccountButton.click();

        /*
        String createAccountPartialText = "New Acc";
        By createAccountLocator_2 = By.partialLinkText(createAccountPartialText);
        WebElement createAccountButton_2 = driver.findElement(createAccountLocator_2);
        createAccountButton_2.click();
        */


    }
}
