package core_programming.core_programming_intermediate.String.Level1;

class ArrayIndexDemo {

    static void handleException() {

        try {

            int[] arr = { 1, 2, 3 };

            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {

        handleException();
    }
}
