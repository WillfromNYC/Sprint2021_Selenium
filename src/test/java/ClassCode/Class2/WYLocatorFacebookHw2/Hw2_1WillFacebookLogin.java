package ClassCode.Class2.WYLocatorFacebookHw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hw2_1WillFacebookLogin {

    @Test
    public void facebookCreateAcct() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Will\\Documents\\git\\Spring2021_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.get("https://www.facebook.com");
        By byCreateAcct = By.xpath("//a[text()='Create New Account']");
        WebElement webCreateAcct = driver.findElement(byCreateAcct);
        webCreateAcct.click();

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        String fName = "First";
        By byFName = By.name("firstname");
        WebElement webFName = driver.findElement(byFName);
        webFName.sendKeys(fName);

        String lName = "Last";
        By bylName = By.name("lastname");
        WebElement weblName = driver.findElement(bylName);
        weblName.sendKeys(lName);

        String emailPhoneString = "9898787800";
        By byEmailPhone = By.name("reg_email__");
        WebElement webEmailPhone = driver.findElement(byEmailPhone);
        webEmailPhone.sendKeys(emailPhoneString);

        String passString = "myemail@gmail.com";
        By byPass = By.id("password_step_input");
        WebElement webPass = driver.findElement(byPass);
        webPass.sendKeys(passString);

        By bySignup = By.name("websubmit");
        WebElement webSignup = driver.findElement(bySignup);
        webSignup.click();

        driver.quit();






    }
}
