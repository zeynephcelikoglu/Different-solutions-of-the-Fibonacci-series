import java.util.Scanner;

public class FibonacciFor {
    public static void main(String[] args) {

        // Fibonacci's solution with For.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int a = 1;
        int b = 1;
        int c;

        if (n >= 1) {

            System.out.println(a);
            System.out.println(b);

            for (int i = 0; i < n - 2; i++) {
                c = a + b;
                a = b;
                b = c;

                System.out.println(c);
            }
        }else {
            System.out.println("Invalid input. Please enter a positive integer!");
        }
    }
}