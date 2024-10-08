public class GenericMethodDemo {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);


        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Double Array:");
        printArray(doubleArray);


        String[] stringArray = {"Hello", "World", "Generic", "Method"};
        System.out.println("String Array:");
        printArray(stringArray);
    }
}
