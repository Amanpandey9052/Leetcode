class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] population = new int[101];

        for(int i=0;i<logs.length;i++){
            int birth=logs[i][0];
            int death=logs[i][1];

            for(int year=birth;year<death;year++){
                population[year-1950]++;
            }
        }

        int maxCount=0;
        int currentYear=1950;
        for(int i=0;i<population.length;i++){
            if(population[i]>maxCount){
                maxCount=population[i];
                currentYear=i+1950;
            }
        }

        return currentYear;
    }
}