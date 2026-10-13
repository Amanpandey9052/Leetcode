class Solution {
    public int rob(int[] nums) {
        
        // if(nums.length<2) return nums[0];

        // int[] ans=new int[nums.length];

        // ans[0]=nums[0];
        // ans[1]=Math.max(nums[0],nums[1]);

        // for(int i=2;i<nums.length;i++)
        //     ans[i]=Math.max(ans[i-2]+nums[i],ans[i-1]);
        
        // return ans[nums.length-1];

        //Tme Complexity:O(n),Space Complexity:O(n)  

        
        if(nums.length==1) return nums[0];

        int prev2=nums[0];
        int prev1=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            int current=Math.max(prev2+nums[i],prev1);
            prev2=prev1;
            prev1=current;
        }
        
        return prev1;
    }
}