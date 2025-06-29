public class Approach1 {
    public void setRowToZero(int matrix[][], int row){

        for(int i=0; i<matrix[row].length; i++){
            matrix[row][i] = 0;
        }
    }

    public void setColToZero(int matrix[][], int col){
        for(int i=0; i<matrix.length; i++){
            matrix[i][col] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        if( matrix==null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean row[] = new boolean[rows]; // [true, false, false]
        boolean col[] = new boolean[cols]; // [true, false, false, true]

        for(int i=0; i< rows; i++){
            for ( int j = 0; j< cols; j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0;i<rows; i++){
            if(row[i]==true){
                setRowToZero(matrix, i);
            }
        }

        for( int j =0; j<cols; j++){
            if (col[j]==true){
                setColToZero(matrix, j);
            }
        }

    }
}
