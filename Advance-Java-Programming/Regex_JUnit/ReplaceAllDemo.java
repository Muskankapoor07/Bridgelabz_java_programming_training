public class ReplaceAllDemo {

    public static void main(String[] args) {

        String text =
                "Java Programming";

        String updated =
                text.replaceAll(
                        "Java",
                        "Python");

        System.out.println(updated);
    }
}