package Java101;

import java.util.Scanner;

/**
 * Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
 * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız. 
 * 
 * @author Canberk
 */

public class Hypotenuse {
	
	public static void main(String[] args) {
		
		double a, b, c, u, field, primeter;
		System.out.println("Lütfen üçgenin a ve b kenar uzunluklarını giriniz : ");
		Scanner scan = new Scanner(System.in);
		System.out.println("A kenarını giriniz : ");
		a = scan.nextDouble();
		System.out.println("B kenarını giriniz : ");
		b = scan.nextDouble();
		c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hipotenüsü : " + c);
		scan.close();
		
		primeter = (a + b + c);
		u = (primeter / 2);
		field = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		
		System.out.println("Üçgenin çevresi : " + primeter);
		System.out.println("Üçgenin alanı : " + field);
		
		
		
		
	}

}
