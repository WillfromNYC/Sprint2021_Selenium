package ClassCode.c1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kickoffWY {

    @Test
    public void launchWebPage() {
        //mention path of which driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Will\\Documents\\git\\Spring2021_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); //http = protocol, facebook = domain// driver= variable of new chrome driver

    }
}
