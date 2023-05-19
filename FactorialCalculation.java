import java.util.Scanner;
public class  FactorialCalculation {
    public static void main(String[] args) {

        int n, r, f, combi, nfac = 1, rfac = 1, cfac = 1;

        Scanner inp = new Scanner(System.in);
        System.out.println("n değeri girin: ");
        n = inp.nextInt();
        System.out.println("r değeri girin: ");
        r = inp.nextInt();
        f = n - r;

        for (int i = 1; i <= n; i++)
            nfac = nfac * i;
        for (int i = 1; i < r; i++)
            rfac = rfac * i;
        for (int i = 1; i < f; i++)
            cfac = cfac * i;

        combi = nfac / (rfac * cfac);
        System.out.println("kombinasyon (" + n + "," + r + "): " + combi);
    }
}