package DSA.Arrays.SetMatrixZero;

public class BruteForce {

    public static void setZeroes(int[][] matrix) {

        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        int zeroCount = 0;

        for(int i = 0; i<rowLength; i++){
            for(int j=0; j<columnLength; j++){
                if(matrix[i][j] == 0){
                    zeroCount++;
                }
            }
        }

        int[] rowIdxArray = new int[zeroCount];
        int[] columnIdxArray = new int[zeroCount];
        int temp = 0;

        for(int i =0; i<rowLength; i++){
            for(int j=0; j<columnLength; j++){
                if(matrix[i][j] == 0){
                    rowIdxArray[temp] = i;
                    columnIdxArray[temp] = j;
                    temp++;
                }
            }
        }

        for(int k = 0; k < zeroCount; k++){

            for(int i = 0; i<rowLength; i++){
                matrix[i][columnIdxArray[k]] = 0;
            }

            for(int j = 0; j<columnLength; j++){
                matrix[rowIdxArray[k]] [j] = 0;
            }

        }

    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);
    }
}
