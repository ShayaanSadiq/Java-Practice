public class Arrays2d {
    public static void main(String[] args) {
        // 2D arrays
        
        // String[] fruits = {"apple", "banana", "watermelon"};
        // String[] vegetables = {"onion", "capsicum", "beans"};
        // String[] meats = {"chicken", "mutton", "ham", "fish"};

        String[][] groceries = {{"apple", "banana", "watermelon"},
                                {"onion", "capsicum", "beans"},
                                {"chicken", "mutton", "ham", "fish"}};

        groceries[0][0] = "pineapple";

        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Telephone numberpad

        char[][] telephone = {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'},
                    {'*', '0', '#'}};

        for(char[] rows : telephone) {
            for(char cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
