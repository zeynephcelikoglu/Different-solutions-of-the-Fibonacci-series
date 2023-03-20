import java.util.Scanner;

public class Main {

    // Fibonacci's solution with Methods.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(fib(i) + " ");
        }
    }
    public static int fib(int x) {
        if (x == 0 || x == 1) {
            return x;
        } else {
            return fib(x - 1) + fib(x - 2);
        }
    }
}

