package basic1;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        
        map.put("apple", 0.5);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("orange", 100000.0); // override the previous in the map
        //map.remove("apple");

        //System.out.println(map);
        //System.out.println(map.get("apple"));
        //System.out.println(map.containsKey("coconut")); // if containKey print price
        //System.out.println(map.containsValue(0.5)); // if containValue print key

        for(String key : map.keySet()) {
            System.out.println(key + " : $ " + map.get(key));
        }
    }
}
