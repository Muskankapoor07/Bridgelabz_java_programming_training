public class GenericMethodDemo {

    public static <T> void printArray(T[] array) {

        for(T element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5};
        String[] names = {"Muskan","Rahul","Aman"};

        printArray(numbers);
        System.out.println();

        printArray(names);
    }
}