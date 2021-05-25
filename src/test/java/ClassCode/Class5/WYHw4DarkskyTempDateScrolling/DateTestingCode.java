package ClassCode.Class5.WYHw4DarkskyTempDateScrolling;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTestingCode {

    @Test
    public void dateRunning (){
        Date now = new Date();
        System.out.println(now);
        //String nowString = now;

        SimpleDateFormat sdf = new SimpleDateFormat("dd");

        String currentDay = sdf.format(now);
        System.out.println("current date is: " + currentDay);




    }
}
