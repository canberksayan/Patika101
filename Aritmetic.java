package Java101;

/** 
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan 
 * ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 */

import java.util.Scanner;

public class Aritmetic {
	
	public static void main(String[] args) {
		
		int math, physics, chemistry, turkish, history, music;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen Matematik notunuzu giriniz : ");
		math = input.nextInt();
		System.out.println("Lütfen Fizik notunuzu giriniz : ");
		physics = input.nextInt();
		System.out.println("Lütfen Kimya notunuzu giriniz : ");
		chemistry = input.nextInt();
		System.out.println("Lütfen Türkçe notunuzu giriniz : ");
		turkish = input.nextInt();
		System.out.println("Lütfen Tarih notunuzu giriniz : ");	
		history = input.nextInt();
		System.out.println("Lütfen Müzik notunuzu giriniz : ");	
		music = input.nextInt(); 
		input.close();
		
		int total = (math + physics + chemistry + turkish + history + music);
		double result = total / 6;
		System.out.println("Not ortalamanız : " + result);
		System.out.println(result >= 60? "Sınıfı Geçtiniz":"Sınıfta kaldınız");
		
	}

}
