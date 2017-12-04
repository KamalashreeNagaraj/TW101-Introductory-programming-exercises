// Given a number n, print a centered diamond with your name in place of the middle line
import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Assignment7 ob = new Assignment7();
        Scanner readInput = new Scanner(System.in);
        int userInput = readInput.nextInt();
        String name = "Kamalashree";
        ob.printDiamondWithName(userInput, name);
    }

    void printSpaces(int numberOfSpaces) {
        for(int i=1; i<=numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }

    void printDiamondWithName(int n, String name) {
        int totalPossibleCharacters = (2 * (n - 1)) + 1;
        // print n-1 lines with spaces and asterisks
        for(int j=1; j<n; j++) {
            int asterisksToBePrinted = (2 * (j - 1)) + 1;
            // number of spaces to be printed: (totalPossibleCharacters - asterisksToBePrinted)/2
            printSpaces((totalPossibleCharacters - asterisksToBePrinted)/2);
            for(int k=1; k<=asterisksToBePrinted; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // print your name in center
        System.out.println(name);
        // followed by n-1 lines with spaces and asterisks in reverse order
        for(int j=n-1; j>=1; j--) {
            int asterisksToBePrinted = (2 * (j - 1)) + 1;
            printSpaces((totalPossibleCharacters - asterisksToBePrinted)/2);
            for(int k=1; k<=asterisksToBePrinted; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
