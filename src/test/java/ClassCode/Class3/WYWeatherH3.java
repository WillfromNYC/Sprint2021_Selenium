package ClassCode.Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;

public class WYWeatherH3 {



    @Test
    public void weather () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Will\\Documents\\git\\Spring2021_Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://darksky.net");

        By summaryTemp = By.xpath("//span[@class='summary swap']");
        WebElement webSummaryTemp = driver.findElement(summaryTemp);
        String[] stringSummaryTemp = webSummaryTemp.getText().split("");
        //System.out.println("The text temp is: " + Arrays.toString(stringSummaryTemp));

        System.out.println("The text temp is: " + webTempToInt(stringSummaryTemp));


        /*String degree = "˚";
        String sSummaryTemp = "";
        int degreeIndex = 0;

        for (int i = 0; i<stringSummaryTemp.length; i++) {
            if(stringSummaryTemp[i].contains(degree)) {
                degreeIndex= i-1;
            }
        }

        for (int i = 0; i<=degreeIndex; i++) {
            sSummaryTemp+= stringSummaryTemp[i];
        }
        System.out.println("the value of String onlySummaryTemp is: " + sSummaryTemp);

        int summaryTempInt = Integer.parseInt(sSummaryTemp);
        System.out.println("The text temp is: " + summaryTempInt);*/


        //low temp from website
        By feelTemp = By.xpath("//span[@class='low-temp-text']");
        WebElement webFeelTemp = driver.findElement(feelTemp);
        String[] stringFeelTemp = webFeelTemp.getText().split("");
        //System.out.println("The feelTemp is: " + Arrays.toString(stringFeelTemp));

        System.out.println("The feelTemp is: " + webTempToInt(stringFeelTemp));

        //high temp from website
        By highTemp = By.xpath("//span[@class='high-temp-text']");
        WebElement webHighTemp = driver.findElement(highTemp);
        String[] stringHighTemp = webHighTemp.getText().split("");
        //System.out.println("The high temp is: " + Arrays.toString(stringHighTemp));

        System.out.println("The high temp is: " + webTempToInt(stringHighTemp));

        tempCompare(webTempToInt(stringSummaryTemp),webTempToInt(stringFeelTemp),webTempToInt(stringHighTemp));


    }








    public int webTempToInt(String[] Temp) {

        String degree = "˚";
        String sSummaryTemp = "";
        int degreeIndex = 0;
        String[] stringSummaryTemp = Temp;

        for (int i = 0; i<stringSummaryTemp.length; i++) {
            if(stringSummaryTemp[i].contains(degree)) {
                degreeIndex= i-1;
            }
        }

        for (int i = 0; i<=degreeIndex; i++) {
            sSummaryTemp+= stringSummaryTemp[i];
        }
        //System.out.println("the value of String onlySummaryTemp is: " + sSummaryTemp);

        int summaryTempInt = Integer.parseInt(sSummaryTemp);
        return summaryTempInt;
    }

    public static void tempCompare(int mainTemp, int lowTemp, int highTemp) {
        if (mainTemp > lowTemp && (mainTemp < highTemp )) {
            System.out.println("the main temp is between the high and low temp");
        } else {
            System.out.println("Error, please check values again");
        }
    }

}
