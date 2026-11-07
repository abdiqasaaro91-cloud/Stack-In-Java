
package Stack;

public class ArrayStack_Trace {

    public static void main(String[] args) {

        ArrayStack<String> stack = new ArrayStack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("size " + stack.size() + ", capacity " + stack.capacity());
        stack.push("D");
        System.out.println("size " + stack.size() + ", capacity " + stack.capacity());
        System.out.println("peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("pop: " + stack.pop());
        }

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
