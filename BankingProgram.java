import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Banking Program

        int choice;
        double balance = 0;
        boolean isRunning = true;
        
        while(isRunning) {

            System.out.println("*****************");
            System.out.println("Banking Program");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");
            System.out.print("Enter your choice (1/2/3/4): ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> {
                    balance += deposit();
                    System.out.printf("New Balance = $%.2f\n", balance);
                }
                case 3 -> {
                    balance -=withdraw(balance);
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Enter a valid choice!");
            }
        }

        System.out.println("Thank you! Have a nice day!");

        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.printf("Account Balance: $%.2f\n", balance);
    }
    static double deposit() {
    
        double amount;

        System.out.print("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdraw(double balance) {
        
        double amount;

        System.out.print("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
            return 0;
        } else {
            return amount;
        }
    }
}
