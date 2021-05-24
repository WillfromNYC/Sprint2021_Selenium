package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class AutoSuggestion {

    @Test
    public void autoSuggestionTest() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By destinationInput1 = By.xpath("//input[@id='qf-0q-destination' or @name='q-destination-srs7']");

        By destinationInput2 = By.xpath("(//*[text()='Where to?']/following-sibling::form//button)[1]//span[2]");

        WebElement destinationSearch = null;

        try {
            destinationSearch = driver.findElement(destinationInput1);
        } catch (NoSuchElementException e) {
            destinationSearch = driver.findElement(destinationInput2);
        }

        destinationSearch.clear();
        destinationSearch.sendKeys("new");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * 1. Analyse if auto-suggestions are present in dom as text or attribute value
         * 2. Create a locator that will point to all the auto-suggestion webElements
         * 3. using findElements method to find all auto-suggestion webElements
         * 4. using loop
         *      pick auto-suggestion element
         *          get text value (attribute value)
         *          if (the above value == what user want to select)
         *              click element
         *              and break the loop
         */

        By autoSuggestionLocator = By.xpath("//*[contains(@class,'in-viewport-root')]//span[not(@class) or @class='autosuggest-category-result']");

        List<WebElement> allSuggestions = driver.findElements(autoSuggestionLocator);

        String optionToSelect = "manhattan, New York, New York, United States of America";

        for (WebElement suggestionElement : allSuggestions) {
            String suggestion = suggestionElement.getText();
            System.out.println(suggestion);
            if (suggestion.equalsIgnoreCase(optionToSelect)) {
                suggestionElement.click();
                break;
            }

        }





    }



}
