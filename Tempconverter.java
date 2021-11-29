import java.util.Scanner;
//simple program that converts temps from Celsius to Fahrenheit
public class Tempconverter {
    public static void main(String[] args) {
        //variable declaration 
        double celsius;
        double fahr;
        final double TEMP_CONST = 1.8;
        final int CEL_FAHR = 32;

        //scanner class object
        Scanner in = new Scanner(System.in);
        //prompting user for input
        System.out.print("how cold is it in Celsius?: ");
        celsius = in.nextDouble();
        in.close();

        //conversion logic 
        fahr = (celsius * TEMP_CONST) + CEL_FAHR;

        //printing values after conversion
        System.out.printf("%.2f celsius = %.1f fahrenheit %n", celsius, fahr);


    }

}