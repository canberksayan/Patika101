package Java101;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Kullanıcıdan alınan sayılar ile,
 * Toplam, çıkarma, çarpma ve bölme işlemi yapan bir hesap makinası.
 * 
 * @author Canberk
 *
 */

public class Calculator {

	public static void main(String[] args) {
		
		double n1, n2, result;
		String select;
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz : ");
		n1 = scan.nextDouble();
		System.out.print("İkinci sayıyıy giriniz : ");
		n2 = scan.nextDouble();
	
		System.out.println("Toplama için : +\nÇıkarma için : -\nÇarpma için : *\nBölme için : /");
		select = scan.next();
		DecimalFormat df = new DecimalFormat("#.##");
		scan.close();
		
		switch(select) {
			case "+":
				result = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + df.format(result));
				break;
			case "-":
				result = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + df.format(result));
				break;
			case "*":
				result = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + df.format(result));
				break;
			case "/":
				result = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + df.format(result));
				break;
			default:
				System.out.println("Geçersiz işlem.");
		
		}
			
	}
	
}
