import java.util.HashSet;

public class ValidSudoku_36 {

    public static boolean isValidSudoku(char[][] board) {

        // Check Rows
        for (int i = 0; i < 9; i++) {

            HashSet<Character> row = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (row.contains(board[i][j])) {
                    return false;
                }

                row.add(board[i][j]);
            }
        }

        // Check Columns
        for (int j = 0; j < 9; j++) {

            HashSet<Character> column = new HashSet<>();

            for (int i = 0; i < 9; i++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (column.contains(board[i][j])) {
                    return false;
                }

                column.add(board[i][j]);
            }
        }

        // Check every 3×3 Box
        for (int row = 0; row < 9; row += 3) {

            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> box = new HashSet<>();

                for (int i = row; i < row + 3; i++) {

                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') {
                            continue;
                        }

                        if (box.contains(board[i][j])) {
                            return false;
                        }

                        box.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {

                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}

        };

        if (isValidSudoku(board)) {
            System.out.println("Valid Sudoku");
        } else {
            System.out.println("Invalid Sudoku");
        }
    }
}