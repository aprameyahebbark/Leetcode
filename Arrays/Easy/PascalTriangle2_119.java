import java.util.*;
public class PascalTriangle2_119 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row index: ");
        int rowIndex = sc.nextInt();
        List<Integer> result = getRow(rowIndex);
        System.out.println("Pascal Triangle Row " + rowIndex + " = " + result);

    }
}
