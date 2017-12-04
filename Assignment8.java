// Prints out the numbers 1 through 100 where instead of numbers divisible by three print "Fizz".
// instead of numbers divisible by five print "Buzz". instead of numbers divisible by three and five print "FizzBuzz".
public class Assignment8 {
    public static void main(String[] args) {
        Assignment8 ob = new Assignment8();
        ob.fizzBuzz();
    }

    void fizzBuzz() {
        for(int n=1; n<=100; n++) {
            if(n%15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(n%3 == 0) {
                System.out.println("Fizz");
            }
            else if(n%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(n);
            }
        }
    }
}
