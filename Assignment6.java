// Given a number n, print a centered diamond
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Assignment6 ob = new Assignment6();
        Scanner readInput = new Scanner(System.in);
        int userInput = readInput.nextInt();
        ob.printDiamond(userInput);
    }

    void printSpaces(int numberOfSpaces) {
        for(int i=1; i<=numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }

    void printDiamond(int n) {
        int totalPossibleCharacters = (2 * (n - 1)) + 1;
        for(int j=1; j<=n; j++) {
            int asterisksToBePrinted = (2 * (j - 1)) + 1;
            // number of spaces to be printed: (totalPossibleCharacters - asterisksToBePrinted)/2
            printSpaces((totalPossibleCharacters - asterisksToBePrinted)/2);
            for(int k=1; k<=asterisksToBePrinted; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
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
