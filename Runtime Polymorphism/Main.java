import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();
        
        Animal animal;

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        } else {
            animal = new Cat();
            animal.speak();
        }

        scanner.close();
    }
}
