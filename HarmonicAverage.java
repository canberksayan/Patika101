import java.util.Scanner;

public class HarmonicAverage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Arrays length : ");
        int arrLength = scan.nextInt();
        double[] arr = new double[arrLength];
        System.out.print("Numbers of elements :");
        for (int i = 0; i < arrLength; i++){
            arr[i] = scan.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < arrLength; i++) {
            sum += 1.0 / arr[i];
        }

        double harmonicAverage = arrLength / sum;
        System.out.println("Harmonic average :" + harmonicAverage);
    }

}