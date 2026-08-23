package Medium;

import java.util.Stack;

public class MinStack_155 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack_155() {
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            minStack.push(Math.min(value, minStack.peek()));
        }
    }
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack_155 minStack = new MinStack_155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Minimum: " + minStack.getMin());
        minStack.pop();
        System.out.println("Top: " + minStack.top());
        System.out.println("Minimum: " + minStack.getMin());
    }
}