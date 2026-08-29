package Easy;
import java.util.*;
public class NumberOfStudentsUnableToEatLunch_1700 {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int student : students) {
            q.offer(student);
        }
        int sandwichIndex = 0;
        int leftout = 0;
        while (!q.isEmpty() && leftout < q.size()) {
            if (q.peek() == sandwiches[sandwichIndex]) {
                q.poll();
                sandwichIndex++;
                leftout = 0;
            }
            else {
                q.offer(q.poll());
                leftout++;
            }
        }
        return q.size();
    }
    public static void main(String[] args) {
        int[] students = {1, 1, 0, 1, 1};
        int[] sandwiches = {0, 1, 0, 1, 1};
        int result = countStudents(students, sandwiches);
        System.out.println("Students unable to eat: " + result);
    }
}