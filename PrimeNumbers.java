public class PrimeNumbers {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean primeNum = true; // Asal sayılar için kontrol değişkeni

            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    primeNum = false;
                    break; // Eğer bölen bulunursa içteki döngüden çık
                }
            }
            if (primeNum) {
                System.out.print(i + " ");
            }

        }

    }

}