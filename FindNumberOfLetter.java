package Java101;

import java.util.Arrays;

public class FindNumberOfLetter {

	public static void main(String[] args) {
		
		String cumle = "Yatin kalkin Java calisin";
		String harf = "j";
		
		String [] karakterler = cumle.split("");
		
		System.out.println(Arrays.toString(karakterler));
		
		int sayac = 0;
		
		for (String each : karakterler) {
			if (each.equalsIgnoreCase(harf)) {
				sayac++ ;
			}
		}
			
		if (sayac == 0) {
			System.out.println("İstenen harf cümlede yok");
		}else {
			System.out.println("İstenen harf cümlede " + sayac + " adet kullanılmıştır.");
		}
		
	}
}
