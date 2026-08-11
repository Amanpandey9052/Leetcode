class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0]=0;
        
        int index=1;
        for(int i=0;i<gain.length;i++){
            altitude[index++] = altitude[i]+gain[i];
        }

        int max=altitude[0];

        for(int i=0;i<altitude.length;i++){
            if(altitude[i]>max){
                max=altitude[i];
            }
        }

        return max;
    }
}