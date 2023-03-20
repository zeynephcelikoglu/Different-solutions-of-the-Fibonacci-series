import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        //Fibonacci's solution with While.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int a = 1;
        int b = 1;
        int c;

        if (n >= 1) {

            System.out.println(a);
            System.out.println(b);

            int i = 0;
            while (i < n - 2) {
                c = a + b;
                a = b;
                b = c;

                System.out.println(c);
                i++;
            }

        }else {
            System.out.println("Invalid input. Please enter a positive integer!");
        }
    }
}
