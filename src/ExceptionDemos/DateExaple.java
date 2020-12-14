package ExceptionDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExaple {

    public static void main(String[] args) throws ParseException {

        String dateStr = "12-Feb-2019";

        SimpleDateFormat sd = new SimpleDateFormat("dd-MMM -yyyy");

        Date date;
      //  try {
            date = sd.parse(dateStr);
        /*}
        catch (Exception e)
        {

        }*/

        System.out.println(date);
        System.out.println("End of the program");


    }
}
