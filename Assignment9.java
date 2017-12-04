// Given an integer N, return a list of prime factors of N that are arranged in increasing numerical order.
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Assignment9 ob = new Assignment9();
        Scanner readInput = new Scanner(System.in);
        ArrayList<Integer> primeFactorsOfN = new ArrayList<Integer>();
        int userInput = readInput.nextInt();
        primeFactorsOfN = ob.primeFactors(userInput);
        for(int factors:primeFactorsOfN) {
            System.out.println(factors);
        }
    }

    ArrayList<Integer> primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        // if number is even
        if(number%2 == 0) {
            factors.add(2);
        }
        while(number%2 == 0) {
            number /= 2;
        }
        // if number is odd (either the user input or after dividing by powers of 2
        int oddNum = 3;
        while (oddNum <= Math.sqrt(number)) {
            if(number%oddNum == 0) {
                if(!factors.contains(oddNum)) {
                    factors.add(oddNum);
                }
                number /= oddNum;
                // restarting from 3 each time eliminates the possible powers of prime factors
                oddNum = 3;
            }
            else {
                oddNum += 2;
            }
        }
        // the final quotient will be a prime factor
        factors.add(number);
        return factors;
    }
}
