import java.util.*; //importing entire package 
/*
 * simple program to reverse any string inputted 
 * develop a program that can string char together to make a string
 * using arrays 
 */
public class ReverseString {
    //driver code 
    public static void main(String[] args) {

        //local varaiable declaration
        String text;
        String sentense;
        int firstIndex = 0;
        int secondIndex = 0;

        //scanner object
        Scanner userInput = new Scanner(System.in);
        //prompting for input
        System.out.print("enter a text: ");
        text = userInput.nextLine();

        //prompting for second string
        System.out.print("enter a text: ");
        sentense = userInput.nextLine();

        //prompting for indices
        System.out.println("enter two indices for substring");
        System.out.print("enter first index: ");
        firstIndex = userInput.nextInt();

        //capturing second index
        System.out.print("enter second index: ");
        secondIndex = userInput.nextInt();

        //testing substrings 
        if (firstIndex <= text.length() && secondIndex <= text.length()) {
            String textExtracted = text.substring(firstIndex, secondIndex);
            System.out.printf("substring: %s %n", textExtracted);
        }
       
        //char character;
        int n = text.length() - 1;
        String spaces = "";
      
        //program logic - reverse string 
        for (int i = n; i >= 0; i--) { //> used here is to allow loop continue running
            //printing out reversed string 
           spaces += text.charAt(i);
        }
        //printing out reversed strimg 
        System.out.println("reversed string: " + spaces);

       //comparing the two texts 
       int diff = text.compareTo(sentense);
       if (diff < 0) {
           System.out.printf("%s preceeds %s %n", text, sentense);
       }
       else if (diff > 0) {
           System.out.printf("%s preceeds %s %n", sentense, text);
       }
       else{
           System.out.println("both strings are the same");
       }
    }
}