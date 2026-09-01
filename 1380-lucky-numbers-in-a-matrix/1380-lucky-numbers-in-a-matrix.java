class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int max=0;
        int column=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    column=j;
                }
            }

            max=maxColumn(matrix,column);

            if(min==max){
                list.add(min);
            }
        }

        

        return list;
    }
    int maxColumn(int[][] matrix,int column){
        int max=matrix[0][column];
        for(int row=0;row<matrix.length;row++){
            max=Math.max(max,matrix[row][column]);
        }
        return max;
    }
}