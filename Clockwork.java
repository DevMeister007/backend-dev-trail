//simple program to display time 
import java.util.*;
/**
 * program is designed to display time
 * may include future updates 
 * solution to think java - String formatting 
 */

public class Clockwork  {
    //am-pm method 
    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
            hour = 12; // midnight
        }
        } else {
            ampm = "PM";
            hour = hour - 12;
        }
            return String.format("%02d:%02d %s", hour, minute, ampm);
        }
        //driver code 
        public static void main (String[] args) {
        //variable declaration
        int hrs = 0;
        int min = 0;
       
       //iterating all possible hours/minutes on a clock
       for (hrs = 0; hrs <= 23; hrs++) {
            //hrs++;
           //iterating through minutes 
           for (min = 0; min < 60; min++) {
               if (min >= 60) {
                   min %= 60;
               }
               //min++; 
            //invoking method 
        String time = timeString(hrs, min);

            //printing out final values
       System.out.println("time is: " + time);
        
           }
       }
         

       
       
    }
}
