import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int a = 0, b = 1, c;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many numbers :");
        int number = scan.nextInt();
        System.out.print(number + " => Fibonacci Series : " + a + ", " + b);

        for (int i = 2; i < number; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();

    }

}