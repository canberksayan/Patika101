import java.util.Scanner;

public class InvertedTriangel {

    public static void main(String[] Args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        int n = scan.nextInt();

        for (int i = n; i > 0; i--) {
            for (int a = 0; a < n - i; a++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}