class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix[0].length;
        int column=matrix.length;

        int[][] result = new int[row][column];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    } 
}