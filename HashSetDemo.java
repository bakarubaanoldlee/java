import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> uniqueColors = new HashSet<>();


        uniqueColors.add("Red");
        uniqueColors.add("Green");
        uniqueColors.add("Blue");

        System.out.println("Initial HashSet: " + uniqueColors);


        uniqueColors.add("Red");
        System.out.println("After adding duplicate 'Red': " + uniqueColors);


        System.out.println("Contains 'Green'? " + uniqueColors.contains("Green"));


        uniqueColors.remove("Blue");
        System.out.println("After removing 'Blue': " + uniqueColors);


        System.out.println("Size of HashSet: " + uniqueColors.size());
    }
}
