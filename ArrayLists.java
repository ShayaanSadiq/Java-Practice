import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        
        // ArrayList<String> fruits = new ArrayList<>();

        // fruits.add("Mango");
        // fruits.add("Apple");
        // fruits.add("Watermelon");
        // fruits.add("Banana");

        // // fruits.remove(0);

        // // fruits.set(0, "Pineapple");

        // // fruits.get(0);

        // // fruits.size();

        // // Collections.sort(fruits);

        // // for(String fruit : fruits) {
        // //     System.out.println(fruit);
        // // }

        // System.out.println(fruits);

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of foods you would like to store: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < num; i ++) {
            System.out.print("Enter a food: ");
            foods.add(scanner.nextLine());
        }
        
        System.out.println(foods);

        scanner.close();
    }
}
