import java.util.Scanner;

public class PrimeNumbersBetween {

    static void minus(int a, int b) {
        if (a > 0) {
            System.out.print(a + " ");
            minus(a - 5, b);
        } else if (a <= 0) {
            plus(a, b);
        }
    }

    static void plus(int a, int b) {
        if (b >= a) {
            System.out.print(a + " ");
            plus(a + 5, b);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = scan.nextInt();
        int b = a;
        minus(a, b);
    }
}