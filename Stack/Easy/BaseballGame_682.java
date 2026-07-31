package Easy;

import java.util.Stack;
public class BaseballGame_682 {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());

            } else if (op.equals("+")) {

                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println("Output 1 : " + calPoints(ops1));
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println("Output 2 : " + calPoints(ops2));
        String[] ops3 = {"1", "C"};
        System.out.println("Output 3 : " + calPoints(ops3));
    }


}