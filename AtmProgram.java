import java.util.Scanner;

public class AtmProgram {

    public static void main(String[] Args) {

        int right = 3, select, withdraw, deposit, balance = 20000;
        Scanner scan = new Scanner(System.in);
        String userName, password;

        while (right > 0) {
            System.out.print("Username : ");
            userName = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();

            if (userName.equals("ABC") && (password.equals("0001"))) {
                System.out.println("Welcome to ABC Bank");
                do {
                    System.out.println("withdraw -> 1\nDeposit -> 2\nBalance inquiry -> 3\nlog out -> 4");
                    System.out.print("Choose the you want to do action : ");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Enter how much you want to withdraw : ");
                            withdraw = scan.nextInt();
                            if (balance < withdraw) {
                                System.out.println("Not enough balance. ");
                            } else {
                                balance -= withdraw;
                            }
                        case 2:
                            System.out.print("Enter how much you want to deposit : ");
                            deposit = scan.nextInt();
                            balance += deposit;
                        case 3:
                            System.out.println("Your balance = " + balance);
                    }
                } while (select != 4);
                System.out.println("Byeee...");
                break;
            } else {
                System.out.println("Incorrect username or password.");
                right--;
                if (right == 0) {
                    System.out.print("Account is blocked. Please contact your bank.");
                } else {
                    System.out.println("Remaining : " + right);
                }
            }
        }
    }
}