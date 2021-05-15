package Class2;

import org.openqa.selenium.By;

public class Locators {
    /**
     *
     * Locator : It's kind of route to reach/find desired webElement.
     * Datatype of Locator --> By
     *
     *
     * Steps to interact with WebElement
     * 1. Find the unique address to reach webElement using DOM
     * 2. Depending upon the type of address/info,
     *      we use specific method from By-Class to create locator
     * 3. use locator to find WebElement using findElement()    eg: driver.findElement(locatorVariable)
     * 4. Then we interact (type, clear, click) with the WebElement
     *
     *
     *
     * Address
     * 1. id (unique)       --> By locatorUsingId = By.id("idValue")
     * 2. name              --> By locatorUsingName = By.name("nameValue");
     *      In chropath, check if name is unique: //*[@name='value']
     * 3. className         --> By locatorUsingClass = By.className("class value");
     *      In chropath, check if class is unique: //*[@class='value']
     * 4. linkText          --> By locatorUsingLinkText = By.linkText("text with link")
     *      In chropath, check if a has unique text: //a[text()='text value']
     * 5. partialLinkText   --> By locatorUsingPartialLinkText = By.partialLinkText("partial text with link")
     *      In chropath, check if a has unique partial text: //a[contains(text(),'partial text value')]
     *
     */

    /**
     * Links:
     *    1.  Always with 'a' tag
     *    2.  After click the link, user will move to new website;
     *          this depends on the value of href attribute.
     *
     *  text associated with a link is called linkText
     *
     */


}

