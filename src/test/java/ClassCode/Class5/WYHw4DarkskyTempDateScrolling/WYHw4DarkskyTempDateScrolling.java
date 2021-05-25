package ClassCode.Class5.WYHw4DarkskyTempDateScrolling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

import static ClassCode.Class3.WYHw3FacebookGenderVerify.WYWeatherHw3.tempCompare;
import static ClassCode.Class3.WYHw3FacebookGenderVerify.WYWeatherHw3.webTempToInt;

public class WYHw4DarkskyTempDateScrolling {


    /**
     * Task1: (darksky.net)
     *
     * 1. Open darksky page
     * 2. Scroll to Today timeline
     * 3. Click the + button
     * 4. Verify tempValues (low and high) on timeline is same as tempValue in the Today's detail
     *
     */

    @Test
    public void weather () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Will\\Documents\\git\\Spring2021_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://darksky.net");

        //get the current temp from Darksky.net
        By summaryTemp = By.xpath("//span[@class='feels-like-text']");
        WebElement webSummaryTemp = driver.findElement(summaryTemp);
        String[] stringSummaryTemp = webSummaryTemp.getText().split("");
        //System.out.println("The text temp is: " + Arrays.toString(stringSummaryTemp));

        System.out.println("The Summary temp is: " + webTempToInt(stringSummaryTemp));
        int clickSummaryTempInt = webTempToInt(stringSummaryTemp);

        //need action interaction?



        //need scroll action
        WebElement webScrollPlus = driver.findElement(By.xpath("//a[@data-day='0']"));
        // //a[@data-day='0'] //a[@data-day='0']/descendant::*[@class='toggle']
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,300)");
        //js.executeScript("arguments[0].scrollIntoView(true);",webScrollPlus);
        //Actions act = new Actions(driver);
        //act.moveToElement(webScrollPlus).build().perform();

        //need 5 secs for it to register the click
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webScrollPlus.click();

        //get the clicked low temp
        WebElement clickLowTempWeb = driver.findElement(By.xpath("//a[@data-day='0']//span[@class='minTemp']"));
        String[] clickLowTempArray = clickLowTempWeb.getText().split("");
        int clickLowTempInt = webTempToInt(clickLowTempArray);
        System.out.println("click low temp: " + clickSummaryTempInt + ", int value: " + clickLowTempInt);

        //get the clicked high temp
        WebElement clickHighTempWeb = driver.findElement(By.xpath("//a[@data-day='0']/following-sibling::*[@class='dayDetails revealed']/descendant::span[@class='lowTemp swap']/descendant::span[@class='temp']"));
        String[] clickHighTempArray = clickHighTempWeb.getText().split("");
        int clickHighTempInt = webTempToInt(clickHighTempArray);

        //compare all 3 results using previous methods
        tempCompare(clickSummaryTempInt,clickLowTempInt,clickHighTempInt);

        driver.close();





        /*try {
            WebElement webScrollPlus = driver.findElement(By.xpath("//a[@data-day='0']"));
            // //a[@data-day='0'] //a[@data-day='0']/descendant::*[@class='toggle']
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("scrollBy(0,300)");
            js.executeScript("arguments[0].scrollIntoView(true);",webScrollPlus);
            Actions act = new Actions(driver);
            act.moveToElement(webScrollPlus).build().perform();
            webScrollPlus.click();
        } catch(ElementClickInterceptedException e) { //NoSuchElementException didn't work, Selenium gave ElementClickInterceptedException: element click intercepted: Element is not clickable at point (904, 880)
            throw new AssertionError("A clear description of the failure", e);
        }*/





        //other webelements: //a[@data-day='0']/descendant::*[@class='toggle']

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/



    }




    /**
     * Task2: (darksky.net)
     *
     * 1. Open darksky page
     * 2. Click Time Machine button
     * 3. Verify current date is selected
     *
     */

    @Test
    public void weatherDateVerify() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Will\\Documents\\git\\Spring2021_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1000)");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //get Time machine web element
        By getTime = By.xpath("//*[contains(text(),'Time Machine')]");
        WebElement webGetTime = driver.findElement(getTime);
        webGetTime.click();

        //get the current date text
        WebElement webCurrentDate = driver.findElement(By.xpath("//td[@class='is-today']//button[@class='pika-button pika-day']"));
        String webCurrentDateString = webCurrentDate.getText();
        System.out.println("current web date is: " + webCurrentDateString);

        //get the current date from Selenium
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat sdf = new SimpleDateFormat("dd");

        String currentDay = sdf.format(now);
        System.out.println("current date is: " + currentDay);

        Assert.assertEquals(webCurrentDateString,currentDay,"current dates are not equal");
        System.out.println("The current website date is matching as expected");

        driver.close();
    }




    /**
     * Task3: (darksky.net)
     *
     * 1. Open darksky page
     * 2. Click DarkSky API on header
     * 3. Click the 'blog post' link
     * 4. Verify that all article dates are in MonthName Date, Year format
     * 5. Verify article dates are in reverse chronological order (recent date first)
     *
     */
    @Test
    public void articleDateVerify() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Will\\Documents\\git\\Spring2021_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net");

        //get and click API link
        WebElement darkSkyAPIWeb = driver.findElement(By.xpath("//a[@href='/dev']"));
        darkSkyAPIWeb.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement blogpostWeb = driver.findElement(By.xpath("//a[@href='https://blog.darksky.net/']"));
        blogpostWeb.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //get blog post dates
        By blogPostBy = By.xpath("//p[@style='font-style: italic; font-size: 14px; color: #333;']");
        List<WebElement> blogPostDateWeb = driver.findElements(blogPostBy);

        for (WebElement post : blogPostDateWeb) {
            System.out.println("blog post are: " + post.getText()); //By Adam Grossman on August 1, 2020.
        }
        //get string date, probably targeting "on "

        List<String> fromArray = Arrays.asList(givenArray);
        // List<String> duplicates = new ArrayList<>();
        Set<String> duplicates = new HashSet<>();
        for (int i=0; iString value : fromArray) {
            if (fromArray.indexOf(value) != fromArray.lastIndexOf(value)) {
                duplicates.add(value);
            }
        }


    }
    /**
     * Task4: (https://classroomessentialsonline.com/)
     *
     * 1. Open classroom essentials
     * 2. Verify 'School Furniture' has maximum number of options.
     * 3. Verify 'Chruch Chairs' menu has 7 options
     */




}
