import java.util.*;

public class Triangle_120 {

    public static int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        // Start from second last row
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                int down = triangle.get(i + 1).get(j);
                int diagonal = triangle.get(i + 1).get(j + 1);

                triangle.get(i).set(j,
                        triangle.get(i).get(j) + Math.min(down, diagonal));
            }
        }

        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>(Arrays.asList(2)));
        triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
        triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));

        int result = minimumTotal(triangle);

        System.out.println("Minimum Path Sum = " + result);
    }
}