package DSA.Arrays.SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimized {

    private static void setMatrixZero(int[][] matrix) {
        int col0 = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (j!=0){
                        matrix[0][j] = 0;
                    }else {
                        col0 = 0;
                    }
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0){
            for (int j=0; j<matrix[0].length;j++) matrix[0][j] = 0;
        }

        if (col0 == 0){
            for (int i=0; i<matrix[0].length;i++) matrix[i][0] = 0;
        }

    }

    public static void main(String[] args) {
        int [][] matrix =
                {
                        {1,1,1,1},
                        {1,0,1,1},
                        {1,1,0,1},
                        {0,1,1,1}
                };
        setMatrixZero(matrix);
    }
}
