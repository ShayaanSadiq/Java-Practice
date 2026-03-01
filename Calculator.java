import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Simple Calculator
        
        Scanner scanner = new Scanner(System.in);

        double value1;
        double value2;
        double result = 0;
        char operator;
        boolean validOperation = true;
        
        System.out.print("Enter the first number: ");
        value1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        value2 = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = value1 + value2;
            case '-' -> result = value1 - value2;
            case '*' -> result = value1 * value2;
            case '/' -> {
                if(value2==0) {
                    System.out.println("Cannot divide by zero");
                    validOperation = false;
                } else {
                    result = value1 / value2;
                }
            }
            case '^' -> result = Math.pow(value1, value2);
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if(validOperation) {
            System.out.println(value1 + " " + operator + " " + value2 + " = " + result);
        }

        scanner.close();
    }
}