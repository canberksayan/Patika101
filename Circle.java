package Java101;

import java.util.Scanner;

/**
 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
 * Alan Formülü : π * r * r;
 * Çevre Formülü : 2 * π * r;
 * 
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 * 𝜋 sayısını = 3.14 alınız.
 * Formül : (𝜋 * (r*r) * 𝛼) / 360
 * 
 * @author Canberk
 *
 */
public class Circle {
	
	public static void main(String[] args) {

		double pi = 3.14;
		double circleArea, circleCircumference, r, a, areaCircleSegment;
		
		System.out.println("Bir yarıçap(r) belirtiniz : ");
		Scanner scan = new Scanner(System.in);
		r = scan.nextDouble();
		
		circleArea = pi * (r * r);
		circleCircumference = 2 * pi * r;
		
		System.out.println("Dairenin alanı : " + circleArea);
		System.out.println("Dairenin çevresi : " + circleCircumference);
		
		System.out.println("Bir açı(a) belirtiniz : ");
		a = scan.nextDouble();
		areaCircleSegment = (pi * (r * r) * a / 360);
		System.out.println("Vermiş olduğunun açının, daire üzerinde ki dilim alanı : " + areaCircleSegment);
		scan.close();

	}
}
