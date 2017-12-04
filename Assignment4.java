// Given a number n, print n lines, each with one more asterisk than the last
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Assignment4 ob = new Assignment4();
        Scanner readInput = new Scanner(System.in);
        int userInput = readInput.nextInt();
        ob.drawTriangle(userInput);
    }
    void drawTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
