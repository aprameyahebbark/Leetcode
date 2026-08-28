package Easy;

import java.util.Queue;
import java.util.LinkedList;
public class ImplementStackUsingQueues_225 {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public ImplementStackUsingQueues_225() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop() {
        return q1.poll();
    }
    public int top() {
        return q1.peek();
    }
    public boolean empty() {
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        ImplementStackUsingQueues_225 stack = new ImplementStackUsingQueues_225();
        stack.push(14);
        stack.push(32);
        stack.push(2);
        System.out.println("Top: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is Empty?: " + stack.empty());
    }
}