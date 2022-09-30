package Homework8;

import java.util.Stack;

public class SpecStack {
    private Stack<Integer> helper = new Stack<>();   //  array  10, 20, 30, 40, 20, 90, 70, 5  <-- stack top
    private int top = -1;
    private static int STACK_SIZE = 1000;
    private int[] arr = new int[STACK_SIZE];

    public boolean empty() {
        return top < 0;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top];
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        if (helper.peek() == arr[top]) {
            helper.pop();
        }
        return arr[top--];
    }

    public void push(int x) {
        if (top < STACK_SIZE - 1) {
            arr[++top] = x;
            System.out.println("Element " + x + " as been added to stack");
        } else {
            System.out.println("Stack overflow");
        }
        if (helper.empty()) {
            helper.push(x);
        } else if (x <= helper.peek()) {
            helper.push(x);
        }
    }

    public int getMin() {
        if (empty()) {
            System.out.print("Stack is empty ");
            return 0;
        }
        return helper.peek();
    }

    public void printStack() {
        System.out.print("[");
        for (int i = top; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }


}
