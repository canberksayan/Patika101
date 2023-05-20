import java.util.Scanner;

public class PalindromeWord {

    public static void main(String[] args) {

        System.out.println("***Palindrome Word***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text : ");
        String text = scanner.nextLine();

        int lowIndex = 0;
        int highIndex = text.length() - 1;
        boolean isPalidrome = true;

        while (lowIndex < highIndex) {
            if (text.charAt(lowIndex) != text.charAt(highIndex)) {
                isPalidrome = false;
                break;

            }
            lowIndex++;
            highIndex--;

        }
        if (isPalidrome) {
            System.out.println("It is Palidrome");

        } else {
            System.out.println("Not Palidrome");
        }

    }

}

