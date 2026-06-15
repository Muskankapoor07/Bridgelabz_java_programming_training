import java.util.*;

public class WildcardDemo {

    public static void printList(
            List<?> list) {

        for(Object obj : list) {
            System.out.print(obj + " ");
        }
    }

    public static void main(String[] args) {

        List<Integer> nums =
                Arrays.asList(1,2,3);

        List<String> names =
                Arrays.asList(
                        "Muskan",
                        "Rahul");

        printList(nums);
        System.out.println();

        printList(names);
    }
}