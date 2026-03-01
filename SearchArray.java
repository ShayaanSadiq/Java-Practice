import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // int[] numbers = {1, 9, 4, 6, 2, 7, 3};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        
        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++) {
            if(target.equals(fruits[i])) {
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found in array");
        }

        scanner.close();
    }
}
