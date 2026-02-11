import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Temperature Converter

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Farenheit? (C/F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("The Converted Temperature is %.1f°%s", newTemp, unit);
        scanner.close();
    }
}
