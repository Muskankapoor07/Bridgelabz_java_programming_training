public class ArrayStack {

    int[] stack = new int[5];
    int top = -1;

    void push(int data) {
        stack[++top] = data;
    }

    int pop() {
        return stack[top--];
    }

    public static void main(String[] args) {

        ArrayStack s = new ArrayStack();

        s.push(10);
        s.push(20);

        System.out.println(s.pop());
    }
}