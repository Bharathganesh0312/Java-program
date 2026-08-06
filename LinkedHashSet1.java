import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add(null);
        fruits.add(null);

        System.out.println("Fruit Set: " + fruits);
        if(fruits.contains("Mango")) {
            System.out.println("Mango is present in the set.");
        }
        fruits.remove("Apple");
        System.out.println("After removing Apple: " + fruits );

        System.out.println("Iterating over LinkedHashSet:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Total elements:" + fruits.size());

    }
}
