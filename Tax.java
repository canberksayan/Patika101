package Java101;

import java.util.Scanner;

/**
 * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
 * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
 * KDV tutarı hesaplayan programı yazınız.
 * 
 * @author Canberk
 */

public class Tax {
	
	public static void main(String[] args) {
		
	
		System.out.println("Almak istediğiniz ürün fiyatını belirtin : ");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextInt();
		scan.close();
		
		if(x >= 1000) {
			System.out.println("Ürünün tutarınızın : " + (x * 0.08) + " TL'si vergidir, " + (x - (x * 0.08) + " TL'si verigsiz fiyatıdır."));
		}else {
			System.out.println("Ürün tutarınızın : " + (x * 0.18) + " TL'si vergidir, " + (x - (x * 0.18) + " TL'si vergisiz fiyatıdır."));
		}
		
	}

}
