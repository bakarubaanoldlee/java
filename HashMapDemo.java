import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();


        ageMap.put("John", 25);
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 35);

        System.out.println("Initial HashMap: " + ageMap);


        System.out.println("Alice's age: " + ageMap.get("Alice"));


        ageMap.put("John", 26);
        System.out.println("After updating John's age: " + ageMap);


        ageMap.remove("Bob");
        System.out.println("After removing Bob: " + ageMap);


        System.out.println("Contains key 'Alice'? " + ageMap.containsKey("Alice"));


        System.out.println("Contains value 30? " + ageMap.containsValue(30));


        System.out.println("Size of HashMap: " + ageMap.size());
    }
}
