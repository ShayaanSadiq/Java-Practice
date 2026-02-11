import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        
        // Weight Conversion program
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        double weight;
        double newWeight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1) {
			System.out.print("Enter the weight in lbs: ");
			weight=scanner.nextDouble();

			newWeight=weight*0.453592;

			System.out.printf("The weight in kgs is %.2f", newWeight);
        } else if(choice == 2) {
			System.out.print("Enter the weight in kgs: ");
			weight=scanner.nextDouble();

			newWeight=weight*2.20462;

			System.out.printf("The weight in kgs is %.2f", newWeight);
        } else {
			System.out.println("Please choose either 1 or 2!");
		}

        scanner.close();    
    }

}
