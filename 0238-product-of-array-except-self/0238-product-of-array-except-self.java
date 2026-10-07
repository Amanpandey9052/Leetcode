class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] answer=new int[nums.length];

        // for(int i=0;i<nums.length;i++){
        //     int product=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(j==i) continue;

        //         product=product*nums[j];
        //     }
        //     answer[i]=product;
        // }

        

        // return answer;

        // Time Complexity = O(n^2) space complexity=O(n)


        // int[] left=new int[nums.length];
        // int[] right=new int[nums.length];

        // left[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     left[i]=left[i-1]*nums[i-1];
        // }

        // right[nums.length-1]=1;
        // for(int i=nums.length-2;i>-1;i--){
        //     right[i]=right[i+1]*nums[i+1];
        // }

        // int[] ans=new int[nums.length];

        // for(int i=0;i<nums.length;i++){
        //     ans[i]=left[i]*right[i];
        // }

        // return ans;

        //Time complexity and spaxe complexity is O(n)

        // int[] ans=new int[nums.length];

        // ans[0]=1;

        // //ans array replaces left array
        // for(int i=1;i<nums.length;i++){
        //     ans[i]=ans[i-1]*nums[i-1];
        // }

        // //initialised right as 1 instead of right array
        // int right=1;

        // for(int i=nums.length-1;i>=0;i--){
        //     ans[i]=ans[i]*right;
        //     right=right*nums[i];   //updated right variable
        // }

        // return ans;

        // //Most optimum solution Time Complexity=O(n) space Complexity = O(1)

        int[] result=new int[nums.length];

        result[0]=1;
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }

        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*right;
            right=right*nums[i];
        }

        return result;
    }
}