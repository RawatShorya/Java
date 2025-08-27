package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Nqueen {
    public static void main(String[] args) {
        List<List<String>> result = solveNQueens(4);
        System.out.println(result);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        String emptyRow = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add(emptyRow);
        }
        nQueens(board, ans, n, 0);
        return ans;
    }

    public static void nQueens(List<String> board, List<List<String>> ans, int n, int row) {
        if (row == n) {
            ans.add(new ArrayList<>(board));
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, j, n, row)) {
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(j, 'Q');
                board.set(row, sb.toString());
                nQueens(board, ans, n, row + 1);
                sb.setCharAt(j, '.');
                board.set(row, sb.toString());
            }
        }
    }

    private static boolean isSafe(List<String> board, int col, int n, int row) {
        //      Horizontally
        String rowString = board.get(row);
        if (rowString.contains("Q")) {
            return false;
        }

        // Vertically
        for (int j = 0; j < n; j++) {
            String columnString = board.get(j);
            if (columnString.charAt(col) == 'Q') {
                return false;
            }
        }

        //      Left Diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            String boardRow = board.get(i);
            if (boardRow.charAt(j) == 'Q') {
                return false;
            }
        }

        //      Right Diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            String boardRow = board.get(i);
            if (boardRow.charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }
}
