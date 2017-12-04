import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Assignment5 ob = new Assignment5();
        Scanner readInput = new Scanner(System.in);
        int userInput = readInput.nextInt();
        ob.printIsoscelesTriangle(userInput);
    }

    void printSpaces(int numberOfSpaces) {
        for(int i=1; i<=numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }

    void printIsoscelesTriangle(int n) {
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
    }
}
