import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by AlanPolar on 31/05/2017.
 */
public class TimeConversion {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String time = in.next();
    String militaryTime = convertTo24HourTime(time);
    System.out.print(militaryTime);
  }

  public static String convertTo24HourTime(String time) {
      String  militaryTime = null;
      final String separator = ":";
      final int addedHours = 12;
      try {
          String hour = time.substring(0, 2);
          String minutes = time.substring(3, 5);
          String seconds = time.substring(6, 8);
          String period = time.substring(8);

          if (period.equalsIgnoreCase("PM") && !hour.equalsIgnoreCase("12")) {
              Integer newHour = Integer.parseInt(hour);
              newHour += addedHours;
              hour = newHour.toString();
          } else if(period.equalsIgnoreCase("AM") && hour.equalsIgnoreCase("12")) {
              hour = "00";
          }

          militaryTime = hour + separator + minutes + separator + seconds;
          return  militaryTime;

      }catch(Exception e){
        System.out.println(e.getMessage());
      }

      return militaryTime;
  }
}
