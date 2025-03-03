package basic1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList = a resizeable array that stores objects (autoboxing)
        //             array are fixed size, arrayList are resizeable

        integerArrayListExample();
        stringArrayListExample();

    }

    private static void integerArrayListExample() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++) {
            list.add(i+1);
        }
        System.out.println(list);
    }

    private static void stringArrayListExample() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.remove(2);
        fruits.set(0,"Pinapple");
        //System.out.println(fruits.get(1));
        //System.out.println(fruits.size());
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
