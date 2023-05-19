import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        int total = 0, scan;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        scan = scanner.nextInt();

        if (scan <= 1) {
            System.out.println(scan + " Is not a perfect number.");
        } else {
            for (int i = 1; i < scan; i++) {
                if (scan % i == 0) {
                    total += i;
                }
            }

            if (scan % total == 0) {
                System.out.println(scan + " This is a perfect number.");
            } else {
                System.out.println(scan + " Is not a perfect number.");
            }

        }

    }

}
