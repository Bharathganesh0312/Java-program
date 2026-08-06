import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple",50);
        map.put("Banana",20);
        System.out.println(map);
        String keyToFind = "Banana";
        if(map.containsKey(keyToFind)){
            System.out.println(keyToFind+" price: "+map.get(keyToFind));

        }else{
            System.out.println(keyToFind+" not found");
        }
        String keyToRemove ="Orange";
        if(map.remove(keyToRemove)!=null){
            System.out.println(keyToRemove+"remove Successfully");
        }else{
            System.out.println(keyToRemove+" not found");

        }
        System.out.println("Iterating Over HashMap: ");
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Fruit: "+entry.getKey()+", Price: "+entry.getValue());
        }
        int valueToCheck = 60;
        if(map.containsValue(valueToCheck)){
            System.out.println("A fruit with price "+valueToCheck+" exists.");
        }else{

            System.out.println("No fruit found with price "+valueToCheck);
        }map.clear();
        System.out.println("\nHashMap after clearing: "+map);
    }
}
