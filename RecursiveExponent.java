import java.util.Scanner;

public class RecursiveExponent {

    static int power(int a, int b) {

        if (b == 0) {
            return 1;
        }
        return a * power(a, (b - 1));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value : ");
        int a = scan.nextInt();
        System.out.print("Enter exponent : ");
        int b = scan.nextInt();
        System.out.print("Result : " + power(a, b));

    }
}