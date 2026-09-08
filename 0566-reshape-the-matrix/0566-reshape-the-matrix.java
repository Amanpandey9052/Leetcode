class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMatrix = new int[r][c];
        int n=mat.length;
        int orgCol=mat[0].length;
        int[] arr=new int[n*orgCol];

        if((n*orgCol)!=(r*c)){
            return mat;
        }

        int length=0;
        //Storing in 1D array
        for(int[] nums:mat){
            for(int a:nums){
                arr[length++]=a;
            }
        }

        int nLength=0;
        //Storing values of 1D array into 2D array
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                newMatrix[i][j] = arr[nLength++];
            }
        }

        return newMatrix;
    }
}