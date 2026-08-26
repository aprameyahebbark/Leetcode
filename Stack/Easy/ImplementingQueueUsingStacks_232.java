package Easy;

import java.util.Stack;
public class ImplementingQueueUsingStacks_232 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public ImplementingQueueUsingStacks_232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int result = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }
    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int result = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }
    public boolean empty() {
        return stack1.isEmpty() ? true : false;
    }
    public static void main(String[] args) {
        ImplementingQueueUsingStacks_232 queue = new ImplementingQueueUsingStacks_232();
        queue.push(12);
        queue.push(9);
        queue.push(43);
        queue.push(2);
        System.out.println("Front :" + queue.peek());
        System.out.println("Removed : " + queue.pop());
        System.out.println("Is Empty : " + queue.empty());
    }
}
