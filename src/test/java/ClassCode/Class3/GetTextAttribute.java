package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTextAttribute {

    @Test
    public void GetTextAttributeMethod() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify if the forgot password is "Forgot Password?"

        String expForgotPasswordText = "Forgotten password?";

        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgotten password?"));

        /**
         * To get/extract the text associated with the WebElement
         * Method: getText()
         * ReturnType: String
         */
        String actualForgotPasswordText = forgotPasswordLink.getText();

        Assert.assertEquals(expForgotPasswordText, actualForgotPasswordText, "Text is not as expected");

        /**
         * To get the value of any attribute of a webElement
         * Method: getAttribute()
         * Input: String (attrName)
         * Return Type: String (attribute value)
         */
        WebElement loginEmail = driver.findElement(By.id("email"));
        String placeHolderValue = loginEmail.getAttribute("placeholder");
        System.out.println("Value with placeholder attribute: " + placeHolderValue);




    }
}
