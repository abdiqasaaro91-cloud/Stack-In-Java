package Stack;

import java.util.Scanner;
import java.util.Stack;

class Reverser {
    public String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return reversed;
    }
}

public class Reversing_a_String {
    static void main() {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter String to Reverse: ");
        String input = inputObject.nextLine();
        Reverser test = new Reverser();
        String result = test.reverse(input);
        System.out.println("Reversed String: " + result);
    }
}
