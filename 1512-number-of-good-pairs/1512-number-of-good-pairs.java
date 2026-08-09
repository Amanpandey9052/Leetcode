class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int[] arr = new int[101];

        for(int a:nums){
            ans+=arr[a]++;
        }
        return ans;
    }
}