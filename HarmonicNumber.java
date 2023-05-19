import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] Args) {

        int number;
        Scanner scan = new Scanner(System.in);
        double result = 0;
        System.out.print("Bir sayı girin : ");
        number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            result += (1.0 / i);
        }
        System.out.println("Harmonik sayı : " + result);

    }

}