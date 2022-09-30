package Homework8;

public class StackTaskOne {
    public static void main(String[] args) {
        //String string = "abbaca";  // abbaca => aaca => ca
        String string = "azxxzy";    // azxxzy => azzy => ay
        StackChar stack = new StackChar();
        for (int i = string.length() - 1; i >= 0; i--) {
            char curr = string.charAt(i);
            if (stack.empty()) {
                stack.push(curr);
            } else {
                if (stack.peek() == curr) {
                    stack.pop();
                } else {
                    stack.push(curr);
                }
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}