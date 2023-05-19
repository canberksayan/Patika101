import java.util.Scanner;

public class FindTheSumIfOddNumbers {

    public static void main(String[] args) {

        int a = 0, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayi giriniz : ");
            a = input.nextInt();
            if (a % 4 == 0) {
                sum += a;
            }
        } while (a % 2 == 0);

        System.out.println("Toplam = " + sum);
    }

}

