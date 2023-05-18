import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        double hight, weight, bodyMassIndex;

        System.out.println("Lütfen boyunuzu(m) ve kilonuzu(kg) giriniz : ");
        Scanner scan = new Scanner(System.in);
        hight = scan.nextDouble();
        System.out.println("Boy : " + hight);
        System.out.println("Kilo : ");
        weight = scan.nextDouble();
        System.out.println("Kilonuz : " + weight);
        scan.close();

        bodyMassIndex = weight / (hight * hight);
        System.out.println("Vücut külte indeksiniz : " + bodyMassIndex);

    }
}
