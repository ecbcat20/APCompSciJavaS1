package stringReversal;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create new scanner
        String s; // create blank String

        System.out.println("Enter String to Reverse: "); // prompt for input
        s = scanner.next();

        ReversedWord word = new ReversedWord(s); // instantiate object word

        word.addLetter(); // add letters to ArrayList

        System.out.println(word.returnString()); // print output of returning String function

        scanner.close(); // close scanner
    }
}