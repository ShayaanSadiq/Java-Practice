import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in);){
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("You must enter a number!");
        } finally {
            System.out.println("This always executes");
        }
    }
}
