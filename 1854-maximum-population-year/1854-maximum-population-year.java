class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] population = new int[101];

        for(int[] log:logs){
            int birth=log[0];
            int death=log[1];

            population[birth-1950]++;
            population[death-1950]--;
        }

        //PrefixSum
        int currentSum=0;
        int maxSum=0;
        int currentYear=1950;
        for(int i=0;i<population.length;i++){
            currentSum+=population[i];

            if(currentSum>maxSum){
                maxSum=currentSum;
                currentYear=i+1950;
            }
        }

        return currentYear;
    }
}