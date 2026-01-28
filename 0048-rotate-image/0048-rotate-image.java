class Solution {
    public void rotate(int[][] matrix) {
        /*
        i,j => j, (n-1-i)
            0,0 => 0,2
            0,1 => 1,2
            0,2 => 2,2

        */
        int n=matrix.length;
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=mat[i][j];
            }
        }
    }
}