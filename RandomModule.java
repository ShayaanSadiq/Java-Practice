import java.util.Random;

public class RandomModule{
    public static void main(String[] args) {
        
        // Random Module

        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1=random.nextInt(1, 101);
        number2=random.nextDouble();
        isHeads=random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        
        if(isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

    }
}