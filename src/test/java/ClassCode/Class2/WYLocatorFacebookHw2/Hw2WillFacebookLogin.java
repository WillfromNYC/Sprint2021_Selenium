package ClassCode.Class2.WYLocatorFacebookHw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hw2WillFacebookLogin {
    //need to create method first
    @Test
    public void facebookLogin() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Will\\Documents\\git\\Spring2021_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String emailString = "myemail@gmail.com";
        By byEmail = By.id("email");
        WebElement webEmail = driver.findElement(byEmail);
        webEmail.sendKeys(emailString);

        String emailPassString = "passw0rd";
        By byPass = By.name("pass");
        WebElement webPass = driver.findElement(byPass);
        webPass.sendKeys(emailPassString);

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


        By byLoginClick = By.name("login");
        WebElement webLoginClick = driver.findElement(byLoginClick);
        webLoginClick.click();
        driver.quit();

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();

        }


        //Part 2 homework







    }
}
