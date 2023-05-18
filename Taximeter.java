package Java101;

import java.util.Scanner;

/**
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
 *
 *	Taksimetre KM başına 2.20 TL tutmaktadır.
 *	Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 *	Taksimetre açılış ücreti 10 TL'dir.
 * 
 * @author Canberk
 *
 */

public class Taximeter {

	public static void main(String[] args) {
		
		double km = 2.20;
		int openingFee = 10;
		
		System.out.println("Kaç km yol gidildi?");
		Scanner distance = new Scanner(System.in);
		Double pay = openingFee + (distance.nextDouble() * km);
		distance.close();
		
		if (pay >= 20) {
			System.out.println("Ödenecek tutar : " + pay + " TL'dir.");
		}else {
			System.out.println("Ödenecek tutar : 20 TL'dir.");
		}
		
	}
}
