class Solution {
    public void sortColors(int[] nums) {
        int countZero=0;
        int countOne=0;
        int countTwo=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) countZero++;
            else if(nums[i]==1) countOne++;
            else countTwo++;
        }
        
        int index=0;
        while(index<countZero) nums[index++]=0;

        int index1=0;
        while(index1<countOne){
            nums[index++]=1;
            index1++;
        } 

        int index2=0;
        while(index2<countTwo) {
            nums[index++]=2;
            index2++;
        }
    }
}