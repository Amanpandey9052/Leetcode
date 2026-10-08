class Solution {
    public boolean canJump(int[] nums) {
        // boolean status=true;

        // int maxReach=0;

        // for(int i=0;i<nums.length;i++){
        //     if(i>maxReach) status=false;

        //     maxReach=Math.max(maxReach,i+nums[i]);
        // }

        // return status;

        int finalPosition=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=finalPosition) finalPosition=i;
        }

        return finalPosition==0;
    }
}