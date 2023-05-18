package Java101;

import java.util.Scanner;

/**
 * 
 * 4 ile ve 400 ile kalansız bölünebilen yıllar.
 * 
 * @author Canberk
 *
 */
public class LeapYearCalculate {
	
	public static void main(String[] args) {
		
		int year;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Artık yıl hesaplama, Bir yıl giriniz : ");
		year = scan.nextInt();
		scan.close();
	
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " yılı bir artık yıldır.");
		}else {
			System.out.println(year + " yılı bir artık yıl değildir.");
		}
	
	}
	
}
