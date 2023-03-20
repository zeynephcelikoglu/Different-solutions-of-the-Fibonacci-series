import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {

        // Fibonacci's solution with Arrays.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int fib[] = new int[n];
        fib[0] = 1;
        fib[1] = 1;

        //Calculate the inside of the array.
        for (int i = 0; i < n - 2; i++) {
            fib[i + 2] = fib[i + 1] + fib[i];
            System.out.println(fib[i]);
        }

        /*
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        */

        // Print the inside of the array.
        for (int i = 0; i < n; i++) {
            System.out.println(fib[i]);
        }
    }
}
