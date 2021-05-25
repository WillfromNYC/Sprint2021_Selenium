package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsMethod {

    @Test
    public void findElementsTest() {

        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://classroomessentialsonline.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        By cChairs = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Church Chairs')]");

        Actions act = new Actions(driver);

        act.moveToElement(driver.findElement(cChairs)).build().perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By cChairsOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Church Chairs')]/following-sibling::div//a");

        List<WebElement> chruchChairsOptions = driver.findElements(cChairsOptions);
        List<WebElement> chruchChairsOptions1 = driver.findElements(cChairsOptions);

        for (WebElement option : chruchChairsOptions) {
            System.out.println(option.getText());
        }



    }



}
