package Java101;
/**
Koç Burcu : 21 Mart - 20 Nisan *
Boğa Burcu : 21 Nisan - 21 Mayıs *
İkizler Burcu : 22 Mayıs - 22 Haziran *
Yengeç Burcu : 23 Haziran - 22 Temmuz *
Aslan Burcu : 23 Temmuz - 22 Ağustos *
Başak Burcu : 23 Ağustos - 22 Eylül *
Terazi Burcu : 23 Eylül - 22 Ekim *
Akrep Burcu : 23 Ekim - 21 Kasım *
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak *
Kova Burcu : 22 Ocak - 19 Şubat *
Balık Burcu : 20 Şubat - 20 Mart *
 */
import java.util.Scanner;

public class HoroscopeCalculator {
	
	public static void main(String[] args) {
			
		int ay, gun;
		String burc = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Doğduğunuz ayı giriniz : ");
		ay = scan.nextInt();
		scan.close();
		if(ay > 12) {
			System.out.println("Geçersiz bir sayı girdiniz.");
		}
		System.out.print("Doğduğunuz günü giriniz : ");
		gun = scan.nextInt();
		if(gun > 31) {
			System.out.println("Geçersiz bir sayı girdiniz.");
		}	
		System.out.println("Dogum gununuz AA/GG = " + ay + "/" + gun);
		
		
		if(ay == 1) {
			if(gun < 22) {
				burc = "Oğlak";
			}else{
				burc = "Kova";			}
		}else if (ay == 2 ) {
			if(gun < 20) {
				burc = "Kova";
			}else {
				burc = "Balık";
			}
		}else if (ay == 3) {
			if(gun < 21) {
				burc = "Balık";
			}else {
				burc = "Koç";
			}
		}else if (ay == 4) {
			if(gun < 21) {
				burc = "Koç";
			}else {
				burc = "Boğa";
			}
		}else if (ay == 5) {
			if(gun < 22) {
				burc = "Boğa";
			}else {
				burc = "İkizler";
			}
		}else if (ay == 6) {
			if(gun < 23) {
				burc = "İkizler";
			}else {
				burc = "Yengeç";
			}
		}else if (ay == 7) {
			if(gun < 23) {
				burc = "Yengeç";
			}else {
				burc = "Aslan";
			}
		}else if (ay == 8) {
			if(gun < 23) {
				burc = "Aslan";
			}else {
				burc = "Başak";
			}
		}else if (ay == 9) {
			if(gun < 23) {
				burc = "Başak";
			}else {
				burc = "Terazi";
			}
		}else if (ay == 10) {
			if(gun < 23) {
				burc = "Terazi";
			}else {
				burc = "Akrep";
			}
		}else if (ay == 11) {
			if(gun < 22) {
				burc = "Akrep";
			}else {
				burc = "Yay";
			}
		}else if (ay == 12) {
			if(gun < 22) {
				burc = "Yay";
			}else {
				burc = "Oğlak";
			}
		}
		
		System.out.println("Burcunuz : " + burc);
		
	}

}
