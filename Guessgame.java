import java.util.*; //importing the entire package
/*
 * future improvements will be to: 1. ensure input taken is an int and tells
 * user whether the guess is too high or low and prompt user for another guess
 * 2.verify how random behaves when inputted number == generated random number
 * 3. develop a standalone method to validate input
 * part of code in the Testing source file
 */
// random number guessing game
public class Guessgame {
    // check if inputted number is higher or lower than random generated number
    public static void differenceCheck (int guessNumber, int inNumber) {
        // method logic for calculating difference
        int diff;
        if (guessNumber > inNumber) {
            diff = guessNumber - inNumber;
            System.out.println("**");
            System.out.printf("your guess was too low, you were off by: %d %n", diff);
        } 
        else {
            diff = inNumber - guessNumber;
            System.out.println("**");
            System.out.printf("your guess was too high, you were off by: %d %n", diff);
    
        }   
    }

    // driver code
    public static void main(String[] args) {
        // local variable declaration
        int inputNumber = 0;
        int genNumber;

        // program description
        System.out.println("*****************************************************");
        System.out.println("welcome to the Guess game! ");

        // terminate program after 3 incorrect guesses or after 1 correct guess
        //refer to line 66
        for (int count = 1; count <= 3; count++) {
          // Scanner object
        Scanner userInput = new Scanner(System.in);

        // prompt for inputNumber
        System.out.print("I'm thinking of a number from 1 to 100. \nCan you guess what it is?: ");
        //input validation logic
        if (userInput.hasNextInt()) {
            inputNumber = userInput.nextInt();

        } else {
            String text = userInput.next();
            System.err.printf("%s is not a valid input, try again", text);
            System.exit(1);
          
        }

            // random object creation
            Random pick = new Random();
            genNumber = pick.nextInt(100) + 1;//traversing numbers from 1 to 100 inclusive 

            // printing out randomly generated number
            System.out.println("**");
            System.out.printf("the number I was thinking of is: %d %n", genNumber);

            //calculate diff btn genNumber and number
            differenceCheck(genNumber, inputNumber);

            //program termination logic - only applies when conditions are met 
            //refer to line 38
            if (count == 3 && (inputNumber != genNumber)) {
                System.out.println("**");
                System.out.println("you've made three(3) incorrect guesses\n\n");
                System.out.println("***********************end of program******************************");
                //close reading from input stream
                userInput.close();
                //exit main and terminate program 
                return;
              
            } else if (inputNumber == genNumber) {
                System.out.println("**");
                System.out.println("**you have guessed correctly");
                System.exit(0);
            }

            
        }   

    }
}

