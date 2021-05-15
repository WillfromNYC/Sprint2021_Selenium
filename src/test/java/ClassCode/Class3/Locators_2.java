package Class3;

public class Locators_2 {
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
     * Address/Locator
     * 6. tagName       --> By locatorUsingTagName = By.tagName("tagname")
     *      In chropath, check if tagName is unique: //tagname
     * 7. xpath         --> By locatorUsingXpath = By.xpath("xpath//to//element")
     *
     */

    /**
     * XPATH
     *
     * Types:
     *  1. Absolute Xpath
     *      starts with single slash (/)
     *      tells the route of webElement from the root tag (or html tag)
     *      not reliable, if any webElement is going to be added/removed in/from the webpage, the absolute xpath may change.
     *
     *  2. Relative Xpath
     *      starts with double slash (//)
     *      reliable bcz we find element using their attributes and text
     *
     *      a) simple xpath (direct xpath)
     *      b) advanced xpath (indirect xpath)
     *
     */

    /**
     * Simple xPath (Direct xpath)
     *
     * 1. Using attribute:
     * //tag[@attrName='attrValue']
     *
     * find the tag in dom, where attribute(attrName) has value as attrValue
     * eg:  //button[@type='submit']
     *
     * 2. Using text:
     * //tag[text()='text value']
     * eg:  //button[text()='Log In']
     *
     * 3. using partial attribute-value
     * //tag[contains(@attrName, 'partial attr val')]
     * eg:  //input[contains(@aria-label, 'Firs')]
     *
     * 4. Using partial text-value
     * //tag[contains(text(), 'partial text val')]
     * eg:  //div[contains(text(), 'First n')]
     *      //div[contains(text(), 'rst na')]
     *
     * 5. Using starting portion of attribute-value
     * //tag[starts-with(@attrName, 'Starting Attr Val')]
     * eg: //input[starts-with(@aria-label, 'Mobi')]
     *
     * 6. Using starting portion of text-value
     * //tag[starts-with(text(), 'Starting Text Val')]
     * eg:  //div[starts-with(text(), 'Mob')]
     *
     * 7. and/or operators
     * //tag[@attrName='attrValue' and contains(text(), 'Text val')]
     * //tag[contains(text(), 'Partial Text') or starts-with(@attrName, 'Partial Attr Val')]
     *
     * 8. not() method
     * finds the tag where attr/text has value not equal to the given value.
     *
     * find tag, where attrName attribute is NOT equal to "val"
     * //tag[not(@attrName='val')]
     * //tag[not(text()='text value')]
     * //tag[not(contains(@attrName, 'Attr value'))]
     *
     */

}

