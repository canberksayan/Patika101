import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] Args) {

        int number, remain, total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = inp.nextInt();

        while (number != 0) {
            remain = number % 10;
            total += remain;
            number /= 10;
        }
        System.out.print(total);
    }
}