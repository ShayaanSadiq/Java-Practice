public class Methods {
    public static void main(String[] args) {
        // Methods

        int number = 3;
        String firstName = "Spongebob";
        String lastName = "Squarepants";
        int age = 18;

        System.out.println(square(number));
        System.out.println(cube(number));
        System.out.println(getFullName(firstName, lastName));
        
        if(checkAge(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You may not sign up!");
        }
        
    }
    
    static double square(int number) {
        return number * number;
    }

    static double cube(int number) {
        return number * number * number;
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static boolean checkAge(int age) {
        return age >=18 ? true : false;
    }
}
