package Homework8;

import java.util.Arrays;
import java.util.Stack;

public class StackExampleApp {
    public static void main(String[] args) {
        SpecStack stack = new SpecStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(20);
        stack.push(90);
        stack.push(70);
        stack.push(5);
        stack.pop();
        stack.push(9);
        stack.push(9);
        stack.pop();
        stack.pop();

        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        reverse(stack1);
        System.out.println(stack1);
//        stack.printStack();
//
//        System.out.println(stack.pop());

    }

    public static Stack<Integer> reverse(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        if (!s.empty()) {

            temp.push(s.pop());

            return reverse(s);
        }

        return temp;
    }
}