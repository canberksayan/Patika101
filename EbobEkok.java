import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] Args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayı : ");
        int sayi1 = scan.nextInt();
        System.out.print("İkinci sayı : ");
        int sayi2 = scan.nextInt();
        int a = sayi1, b = sayi2, Ebob = 1, Ekok, i = 2;

        while ((a % i == 0) && (b % i == 0)) {
            a = a / i;
            b = b / i;
            Ebob *= i;
            if ((a % i != 0) || (b % i != 0)) {
                i++;
            }

        }
        Ekok = (sayi1 * sayi2) / Ebob;
        System.out.println("Ebob : " + Ebob);
        System.out.print("Ekok : " + Ekok);
    }
}