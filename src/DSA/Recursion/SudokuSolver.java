package DSA.Recursion;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    private static boolean helper(char[][] board, int row, int col) {

        if (9 == row) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, digit, row, col)) {
                board[row][col] = (char) ('0' + digit);
                if (helper(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    private static boolean isSafe(char[][] board, int digit, int row, int col) {
        //Horizontally
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] == digit + '0') {
                return false;
            }
        }

        //Vertically
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == digit + '0') {
                return false;
            }
        }

        //Grid
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = srow; i < srow + 2; i++) {
            for (int j = scol; j < scol + 2; j++) {
                if (board[i][j] == digit + '0') {
                    return false;
                }
            }
        }

        return true;
    }
}
