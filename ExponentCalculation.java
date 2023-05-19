import java.util.Scanner;

public class ExponentCalculation {

    public static void main(String[] args) {

        int number, exponent;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();
        System.out.print("Üssü sayıyı giriniz : ");
        exponent = inp.nextInt();

        int total = 1;

        for (int i = 1; i <= exponent; i++) {
            total *= number;
        }
        System.out.print(total);
    }
}