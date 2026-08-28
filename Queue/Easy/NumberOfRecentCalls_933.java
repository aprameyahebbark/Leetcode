package Easy;

import java.util.*;
public class NumberOfRecentCalls_933 {
    Queue<Integer> q = new LinkedList<>();
    public NumberOfRecentCalls_933() {
    }
    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
    public static void main(String[] args) {
        NumberOfRecentCalls_933 obj = new NumberOfRecentCalls_933();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }
}