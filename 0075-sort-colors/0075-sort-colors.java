class Solution {
    public void sortColors(int[] nums) {
        // int countZero=0;
        // int countOne=0;
        // int countTwo=0;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0) countZero++;
        //     else if(nums[i]==1) countOne++;
        //     else countTwo++;
        // }
        
        // int index=0;
        // while(index<countZero) nums[index++]=0;

        // int index1=0;
        // while(index1<countOne){
        //     nums[index++]=1;
        //     index1++;
        // } 

        // int index2=0;
        // while(index2<countTwo) {
        //     nums[index++]=2;
        //     index2++;
        // }

        // Time Complexity:O(n),Space Complexity:O(1)

        


        //Dutch National Flag Algorithm

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}