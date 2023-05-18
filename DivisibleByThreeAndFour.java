package Java101;

import java.util.Scanner;

/**
 * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e 
 * tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 * 
 * @author Canberk
 */
public class DivisibleByThreeAndFour {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
	    int sayi = scan.nextInt();
	    scan.close();
	    
	    int toplam = 0, miktar = 0;
	    int guncelSayi = sayi >= 12 ? 12 : sayi + 1;

	    while (guncelSayi <= sayi) {
	    	toplam += guncelSayi;
	    	miktar++;

	    	guncelSayi = 12 * (miktar + 1);
	    	}

	    if(miktar > 0) System.out.println("Ortalama : " + (toplam / miktar));
	    else System.out.println("Ortak çarpan yok! Ortalama : 0");
	}
	
}
