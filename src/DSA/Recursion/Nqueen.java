package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Nqueen {
    public static void main(String[] args) {
        List<List<String>> result = solveNQueens(4);
        System.out.println(result);
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String emptyBoard = ".".repeat(n);
        for (int i = 0; i < n; i++) {
            board.add(emptyBoard);
        }
        nQueen(board, ans, n, 0);
        return ans;
    }

    private static void nQueen(List<String> board, List<List<String>> ans, int n, int row) {

        if (n == row){
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int j = 0; j < n; j++) {
            if(isSafe(board, row, j, n)){
                StringBuilder stringBuilder = new StringBuilder(board.get(row));
                stringBuilder.setCharAt(j, 'Q');
                board.set(row, stringBuilder.toString());
                nQueen(board, ans, n, row+1);
                stringBuilder.setCharAt(j, '.');
                board.set(row, stringBuilder.toString());
            }
        }

    }

    public static boolean isSafe(List<String> board, int row, int col, int n){
        //Check Horizontally
        if (board.get(row).contains("Q")){
            return false;
        }

        //Check Vertically
        for (int i = 0; i<n; i++){
            if (board.get(i).charAt(col) == 'Q'){
                return false;
            }
        }

        //Check Diagonally on left side
        for (int i=row, j=col; i>=0 && j>=0; i--, j--){
            if (board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }

        //Check Diagonally on right side
        for (int i=row, j=col; i>=0 && j<n; i--, j++){
            if (board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }

        return true;
    }
}
