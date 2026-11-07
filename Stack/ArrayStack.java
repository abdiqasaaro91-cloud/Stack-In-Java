
package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {

    private static final int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) new Object[initialCapacity];
    }

    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int capacity() {
        return stack.length;
    }

    public static void main(String[] args) {

        ArrayStack<Integer> numbers = new ArrayStack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Stack: " + numbers.size());
        System.out.println("Top element: " + numbers.peek());
        System.out.println("Removed: " + numbers.pop());
        System.out.println("New top: " + numbers.peek());
        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity());
        System.out.println("Is Empty: " + numbers.isEmpty());
    }
}
