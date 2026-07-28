package Medium;

public class Search2DMatrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Search2DMatrix_74 solution = new Search2DMatrix_74();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;
        System.out.println(solution.searchMatrix(matrix, target));
    }
}