class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int max=0;

        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int column=0;
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
        int max=0;
        for(int col=0;col<matrix.length;col++){
            max=Math.max(max,matrix[col][column]);
        }
        return max;
    }
}