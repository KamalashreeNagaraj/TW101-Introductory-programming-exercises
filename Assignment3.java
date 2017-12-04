// Given a number n, print n lines, each with one asterisk
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Assignment3 ob = new Assignment3();
        Scanner readInput = new Scanner(System.in);
        int userInput = readInput.nextInt();
        ob.drawVerticalLine(userInput);
    }

    void drawVerticalLine(int n) {
        for(int i=0; i<n; i++) {
            System.out.println("*");
        }
    }
}
