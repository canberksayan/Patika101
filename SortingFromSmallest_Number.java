package Java101;

import java.util.Scanner;

public class SortingFromSmallest_Number {

	
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 adet sayı giriniz ");
		
		a = scan.nextInt();
		System.out.println("Birinci sayı : " + a);
		b = scan.nextInt();
		System.out.println("İkinci sayı : " + b);
		c = scan.nextInt();
		System.out.println("Üçüncü sayı : " + c);
		scan.close();
		
		if (a < b && a < c && b < c) {
			System.out.println(a + " < " + b + " < " + c);
		}else if ( a < b && a < c && c < b) {
			System.out.println(a + " < " + c + " < " + b);
		}else if ( b < a && b < c && a < c) {
			System.out.println(b + " < " + a + " < " + c);
		}else if ( b < a && b < c && c < a) {
			System.out.println(b + " < " + c + " < " + a);
		}else if ( c < a && c < b && a < b) {
			System.out.println(c + " < " + a + " < " + b);
		}else if ( c < a && c < b && b < a) {
			System.out.println(c + " < " + b + " < " + a);
		}
			
	}
	
}
