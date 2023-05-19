import java.util.Scanner;

public class PowersOfFourAndFive {

    public static void main(String[] Args) {

        int a;
        int b = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        a = inp.nextInt();

        do {
            System.out.println(b);
            b *= 4;
        } while (b <= a);

        System.out.println();
        b = 1;

        do {
            System.out.println(b);
            b *= 5;
        } while (b <= a);
    }
}