import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Take input of array from users
        
        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[size];
        
        for(int i = 0; i < foods.length; i++) {
            System.out.print("Enter food at index " + i + ": ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
