public class Approach2 {

    public void setRowsToZero(int [][]matrix, int row){
        for(int i=0;i<matrix[row].length; i++){
            matrix[row][i] = 0;
        }
    }

    public void setColsToZero(int [][]matrix, int col){
        for(int i=0;i<matrix.length; i++){
            matrix[i][col] = 0;
        }
    }


    public void setZeroes(int[][] matrix) {

        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean row0=false, col0=false;

        for (int i=0; i < cols;i++){
            if(matrix[0][i]==0) row0 = true;
        }
        for(int i=0; i<rows; i++){
            if(matrix[i][0]==0) col0 = true;
        }

        for( int i=1; i<rows;i++){
            for( int j =1 ; j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0; 
                }
            }
        }

        for(int i=1;i<rows;i++){
            if(matrix[i][0]==0){
                setRowsToZero(matrix, i);
            }
        }

        for(int i=1; i<cols;i++){
            if(matrix[0][i]==0){
                setColsToZero(matrix,i);
            }
        }
        if (row0){setRowsToZero(matrix, 0);}
        if (col0){setColsToZero(matrix, 0);}
    }

}
