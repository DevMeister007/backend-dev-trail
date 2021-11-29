//24-hr clock converter 
//updated to calculate number of hours since midnight 
import java.util.Scanner;
/*public class Menu {
    int option;
    //menuscreen method declaration
    public void menuscreen() {

    };
}
*/

public class Timeconverter {
    public static void main(String[] args) {
        
    //local variable declaration
    String timeOfDay; 
    int hour;
    double result = 0.00;

    //array declaration
    double size = 12.00;

    //scanner class object
    Scanner sc = new Scanner(System.in);

    System.out.println("enter time of day: ");
    timeOfDay = sc.nextLine();

    System.out.println("enter time in hours only: ");
    hour = sc.nextInt();

    //time conversion logic using nested cases 
    switch (timeOfDay) {
        case "midnight":
            switch (hour) {
                case 12:
                result = hour - size;
                break;

                default:
                    System.out.println("check hour entered");
            }
            break;

        case "morning":
            result = hour;
            break;

        case "evening":
            result = hour + size;
            break;

        default:
            System.out.println("wrong time of day entered");

    }   

    //printing out values 
    System.out.println("the time is: " + result + "hrs");
}
}
