class Solution {
    public boolean canJump(int[] nums) {
        // boolean status=true;

        // int maxReach=0;

        // for(int i=0;i<nums.length;i++){
        //     if(i>maxReach) status=false;

        //     maxReach=Math.max(maxReach,i+nums[i]);
        // }

        // return status;

        //Initially the final position is the last index
        int finalPosition=nums.length-1;

        //Start with the second last index
        for(int i=nums.length-2;i>=0;i--){

            //If you can reach the final position from this index
            //Update the final flag
            if(i+nums[i]>=finalPosition) finalPosition=i;
        }

        //If we reach the final index,then we can
        //make the jump possible
        return finalPosition==0;
    }
}