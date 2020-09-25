package stackTask;

import java.util.Stack;

public class SymmetricallyArranged {
    // creating boolean method to check an expression
    private static boolean isSymmetricallyArranged(String s) {
        // create Stack object
        Stack<Character> stack  = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // for this type of parentheses push to the stack
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
                // if parentheses are symmetric compare their type and pop
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        // if stack is empty return true
        return stack.isEmpty();
    }

    public static void isBalanced(String line){
        // if the brackets are symmetrically arranged in a string print Yes.
        if (isSymmetricallyArranged(line)) System.out.println( "Yes");
        // if the brackets are not symmetrically arranged in a string print Yes.
        else System.out.println("No");
    }
}
