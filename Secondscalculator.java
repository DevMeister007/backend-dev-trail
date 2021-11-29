import java.util.*;

//simple program to calculate
// no of minutes for the rest of the day
public class Secondscalculator {
    public static void main(String[] args) {
        int hour;
        int numberOfSeconds = 0;
        int standardNumberOfHours = 24;
        double percentOfDay = 0.00;
        double totalSecondsInDay = 86400.00;

        //product description
        System.out.println("simple seconds calculator program");
        System.out.println("------------------------------------");
        //taking user input 
        Scanner sc = new Scanner(System.in);
        System.out.print("what time is it? (enter hour only): ");
        hour = sc.nextInt();
        sc.close();

        //code implementation
        //check for 24-hr limit6
        if (hour <= 24) {
            //(24 - hours inputted by user) * 3600 secs
            numberOfSeconds = (standardNumberOfHours - hour) * 3600; 
            percentOfDay = (numberOfSeconds / totalSecondsInDay) * 100;
        }
        else if (hour > 24) {
            System.out.println("time entered exceeds 24 hrs");
            System.exit(1);
        }
            
        //display remaining hours in seconds 
        System.out.println("remaining seconds before day ends is: " + numberOfSeconds + "secs");
        System.out.printf("percentage of day passed is: %.2f", 100 - percentOfDay);

    }
    
}
