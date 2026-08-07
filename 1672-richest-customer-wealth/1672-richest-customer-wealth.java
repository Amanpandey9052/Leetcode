class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int maxSum=0;
        for(int i=0;i<m;i++){
            int currentSum=0;
            int n=accounts[i].length;
            for(int j=0;j<n;j++){
                currentSum+=accounts[i][j];
                maxSum=Math.max(maxSum,currentSum);
            }
        }
        return maxSum;
    }
}