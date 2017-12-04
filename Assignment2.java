// Given a number n, print n asterisks in one line
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Assignment2 ob = new Assignment2();
        Scanner readInput = new Scanner(System.in);
        int userInput = readInput.nextInt();
        ob.drawHorizontalLine(userInput);
    }

    void drawHorizontalLine(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
