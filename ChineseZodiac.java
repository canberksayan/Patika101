package Java101;

import java.util.Scanner;

public class ChineseZodiac {
	
	public static void main(String[] args) {
		
	System.out.println("Lütfen doğum yılınızı giriniz : ");
		
	int yil, zodyak;
	String hayvan = " ";
	
	Scanner input = new Scanner(System.in);
	yil = input.nextInt();
	zodyak = yil%12;
	input.close();
		
	
	if (zodyak == 0) {
		hayvan = "maymun";
	}
	else if (zodyak == 1) {
		hayvan = "horoz"; 
	}
	else if (zodyak == 2) {
		hayvan = "köpek"; 
	}
	else if (zodyak == 3) {
		hayvan = "domuz"; 
	}
	else if (zodyak == 4) {
		hayvan = "fare"; 	
	}
	else if (zodyak == 5) {
		hayvan = "öküz"; 
	}
	else if (zodyak == 6) {
		hayvan = "kaplan"; 
	}
	else if (zodyak == 7) {
		hayvan = "tavşan"; 
	}
	else if (zodyak == 8) {
		hayvan = "ejderha"; 
	}
	else if (zodyak == 9) {
		hayvan = "yılan"; 
	}
	else if (zodyak == 10) {
		hayvan = "at"; 
	}
	else if (zodyak == 11) {
		hayvan = "koyun"; 
	}	

	System.out.println("Çin zodyağına göre " + hayvan + " burcusunuz.");
		
		
	}
}