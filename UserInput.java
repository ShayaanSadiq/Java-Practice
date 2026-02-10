import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        // User input and input buffer

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // To catch input buffer, we use scanner.nextLine()

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // To catch input buffer, we use scanner.nextLine()

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is : " + gpa);

        if(isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are NOT a student.");
        }

        scanner.close();
    }
}
