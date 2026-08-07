class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            runningSum[i]=sum(nums,i);
        }

        return runningSum;
    }

    int sum(int[] arr,int b){
        int sum=0;
        for(int i=0;i<=b;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

// class Solution{
//    public int[] runningSum(int[] nums){
//         for(int i=1;i<nums.length)
//    } 
// }