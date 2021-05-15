package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnabledDisplayedSelected {


    @Test
    public void webElementSelectedDisplayedEnabled() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String createAccountText = "Create New Account";
        By accountTextLocator = By.linkText(createAccountText);
        WebElement createAccountButton = driver.findElement(accountTextLocator);
        createAccountButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement maleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));

        /**
         * To verify if the WebElement is Selected or not
         * Method: isSelected()
         * Return Type: boolean
         *
         */
        boolean isMaleButtonSelected = maleRadio.isSelected();
        System.out.println("is Male radio button selected: " + isMaleButtonSelected);

        /**
         * To verify if the WebElement is Displayed or not
         * Method: isDisplayed()
         * Return Type: boolean
         *
         */
        boolean isMaleButtonDisplayed = maleRadio.isDisplayed();
        System.out.println("is Male radio button displayed: " + isMaleButtonDisplayed);

        /**
         * To verify if the WebElement is Enabled or not
         * Method: isEnabled()
         * Return Type: boolean
         *
         */
        boolean isMaleButtonEnabled = maleRadio.isEnabled();
        System.out.println("is Male radio button enabled: " + isMaleButtonEnabled);


    }





}
