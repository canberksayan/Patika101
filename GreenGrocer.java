import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram 
 * değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 * Meyveler ve KG Fiyatları;
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 *
 * @author Canberk
 *
 */

public class GreenGrocer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.print("Kaç kg armut : ");
        armutKg = scan.nextDouble();
        System.out.print("Kaç kg elma : ");
        elmaKg = scan.nextDouble();
        System.out.print("Kaç kg domates : ");
        domatesKg = scan.nextDouble();
        System.out.print("Kaç kg muz : ");
        muzKg = scan.nextDouble();
        System.out.print("Kaç kg patlıcan : ");
        patlicanKg = scan.nextDouble();
        scan.close();

        DecimalFormat df = new DecimalFormat("#.##");
        double total = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.println("Toplam ödeme : " + df.format(total));

    }
}
