import java.util.Scanner;

public class CalculatorProf {

    static void addition() {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " number :");
            number = scan.nextInt();
            result += number;
        }
        System.out.println("Result : " + result);
        System.out.println("New transaction");

    }

    static void extraction() {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " number :");
            number = scan.nextInt();
            result -= number;
        }
        System.out.println("Result : " + result);
        System.out.println("*******************");

    }

    static void times() {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int counter = scan.nextInt();
        int number, result = 1;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " number :");
            number = scan.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result : " + result);
        System.out.println("*******************");

    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers :");
        int counter = scan.nextInt();
        double number;
        double result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " number :");
            number = scan.nextInt();
            if (i != 1 && number == 0) {
                System.out.println("Divisor zero cannot be entered.");
                break;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result : " + result);
        System.out.println("*******************");

    }

    static void exponent() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a base value : ");
        int base = scan.nextInt();
        System.out.print("Enter an exponent : ");
        int exponent = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result : " + result);
        System.out.println("*******************");

    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result : " + result);
        System.out.println("*******************");

    }

    static void mode() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be modded : ");
        int number = scan.nextInt();
        System.out.print("Enter the mode : ");
        int modNumber = scan.nextInt();
        int result;
        result = number % modNumber;
        System.out.println("Mode : " + result);

    }

    static void rectangle() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Long edge : ");
        int longEdge = scan.nextInt();
        System.out.print("Short edge : ");
        int shortEdge = scan.nextInt();
        int environment = (shortEdge + longEdge) * 2;
        int area = shortEdge * longEdge;
        System.out.println("Perimeter of rectangle : " + environment);
        System.out.println("Area of rectangle : " + area);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu =
                "1- Addition\n"
                        + "2- Extraction\n"
                        + "3- Multiplication\n"
                        + "4- Division\n"
                        + "5- Exponential\n"
                        + "6- Factorial\n"
                        + "7- Modding\n"
                        + "8- Rectangular area and perimeter\n"
                        + "0- Exit";

        while (true) {
            System.out.println(menu);
            System.out.print("Select a transaction : ");
            select = scan.nextInt();

            switch (select) {
                case 0:
                    System.out.println("Bye");
                    System.exit(0);
                case 1:
                    addition();
                    break;
                case 2:
                    extraction();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    exponent();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("An incorrect value, please try again...");

            }

        }

    }

}