import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Initial ArrayList: " + fruits);


        fruits.add(1, "Blueberry");
        System.out.println("After adding Blueberry: " + fruits);


        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);


        System.out.println("Element at index 1: " + fruits.get(1));


        fruits.set(2, "Grape");
        System.out.println("After modifying Cherry to Grape: " + fruits);


        System.out.println("Contains Apple? " + fruits.contains("Apple"));


        System.out.println("Size of ArrayList: " + fruits.size());
    }
}
