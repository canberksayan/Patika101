package Java101;

import java.util.Scanner;

/**
 * Koşullar :
 * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 * 
 * @author Canberk
 *
 */
public class RecommendationByTemperature {

	public static void main(String[] args) {
		
		int temperature;
		
		System.out.println("Hava sıcaklığına göre bir etkinlik planlayalım, Sıcaklığı giriniz : ");
		Scanner scan = new Scanner(System.in);
		temperature = scan.nextInt();
		scan.close();
		
		if (temperature <= 5) {
			System.out.println("Kayak yapabilirsiniz.");
		}else if (temperature > 5 && temperature <= 15) {
			System.out.println("Sinemya gidebilirsiniz.");			
		}else if (temperature > 15 && temperature <= 25) {
			System.out.println("Piknik yapabilirsiniz.");
		}else if (temperature > 25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		
	}
	
}
