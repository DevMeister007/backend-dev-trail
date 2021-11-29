import java.util.*; //importing entire library
import java.util.InputMismatchException;

/*
*program verifies if indeed no three ints
*a, b and c can satisfy the equation (a^n + b^n = c^n)
*except when n>=2
*/
public class Fermat {

    //method logic to find viable numbers 
    public static void testingNumbers(int rangeLimit, int exponent) {

        //terminate if exponent is lesser than 3
        if (exponent < 2) {
            System.out.print("enter an exponent greater than (2)");
            return;
        }
        //traversing from 1 till range limit 
        for (int firstNum = 1; firstNum <= rangeLimit; firstNum++) {
            for (int secondNum = firstNum; secondNum <= rangeLimit; secondNum++) {

            //finding the sum of the natural numbers firstNum ^ exponent + secondNum ^ exponent 
             int sum_pow = (int) (Math.pow(firstNum, exponent) + Math.pow(secondNum, exponent)); 

             //finding the sqrt of the sum of squared natural numbers 
             //double sumPowVar = Math.pow(sum_pow, 1.0 / exponent);-- obsoleted 
             double sumPowVar = Math.sqrt(sum_pow);

             //finding square of sum 
             int pow_sum = (int) Math.pow((int)sumPowVar, exponent);

             //check if sum_pow = pow_sum
             if (sum_pow == pow_sum) {
                System.out.println("********************************");
                System.out.printf("eureka!, pair found (%d, %d) %n", firstNum, secondNum);
                System.out.println("********************************");
             }
             else {
                 System.out.println("no pair found within given range");
             }
            }
        }

    }
    //driver code
    public static void main(String[] args) {
        //local variable declaration
        //formulae (a^n + b^n = c^n)
        int limit = 0;
        int expo = 0; //exponent
        //new Scanner object
        Scanner userInput = new Scanner(System.in);

        //input validation
        boolean inputFlag = false;
    while (!inputFlag) {
        try {
        //prompt for input 
        System.out.print("enter range limit:");
        limit = userInput.nextInt();

        System.out.print("enter exponent:");
        expo = userInput.nextInt();

        inputFlag = true;
    }

        catch (InputMismatchException ex) {
        //bad input entered
        System.out.println("invalid input entered, try again");
        inputFlag = false;
        userInput.next();
        }

    }
    //passing values to method
    testingNumbers(limit, expo);
    }
}
