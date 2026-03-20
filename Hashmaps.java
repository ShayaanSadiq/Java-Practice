import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        // Hashmap

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.5);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.0);

        //map.remove("apple")
        //System.out.println(map.get("coconut"));
        //System.out.println(map.containsKey("apple"));

        // if(map.containsKey("apple")) {
        //     System.out.println(map.get("apple"));
        // } else {
        //     System.out.println("Key not found.");
        // }

        //System.out.println(map.containsValue(1.0));

        // System.out.println(map.size());

        for(String key : map.keySet()) {
            System.out.println(key + ": $" + map.get(key));
        }

    }
}
