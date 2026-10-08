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

        //Space Compexity=O(logn) Time complexity = O(1)

        // List<Integer> list = new ArrayList<>();

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target && nums[i]<=target) list.add(i);
        // }

        // int[] ans={-1,-1};

        // if(list.size()!=0) {
        //     ans[0]=Collections.min(list);
        //     ans[1]=Collections.max(list);
        // }

        // return ans;

        //Brute force approach Time complexity=O(n) space complexity=O(k)
    }
}