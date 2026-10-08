class Solution {
    public boolean canJump(int[] nums) {
        boolean status=true;

        int maxReach=0;

        for(int i=0;i<nums.length;i++){
            if(i>maxReach) status=false;

            maxReach=Math.max(maxReach,i+nums[i]);
        }

        return status;
    }
}