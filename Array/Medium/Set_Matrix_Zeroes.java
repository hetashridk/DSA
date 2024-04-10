// question Link:- https://leetcode.com/problems/set-matrix-zeroes/description/

public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {

        int col0 = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                
                if(matrix[i][j] == 0){
                    
                    // mark the ith row as 0;
                    matrix[i][0] = 0;

                    // mark the jth col as 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }


        // now make the zero expect the first row, first col, col0
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // now mark first row as zero
        if(matrix[0][0] == 0){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        // now marks first col as zero
        if(col0 == 0){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }   
}
