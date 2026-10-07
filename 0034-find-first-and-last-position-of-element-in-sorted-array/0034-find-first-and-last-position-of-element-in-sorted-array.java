class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int left=0;
        int right=nums.length-1;
        
        //find first occurence
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target) {
                ans[0]=mid;
                right=mid-1; //search further left
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        left=0;
        right=nums.length-1;

        //find second occurence
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target) {
                ans[1]=mid;
                left=mid+1; //serch further right
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        
        return ans;
    }
}