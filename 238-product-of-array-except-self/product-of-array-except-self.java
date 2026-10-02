class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int ans[] = new int[nums.length];
        // int multi = 1;
        // int flag = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == 0){
        //         flag = 1;
        //     }else {
        //         multi *= nums[i];
        //     }
        // }
        // if(flag == 0){
        //     for(int i=0; i<nums.length; i++){
        //         ans[i] = multi/nums[i];
        //     }
        // } else {

        //     for(int i=0; i<nums.length; i++){
        //         if(nums[i] == 0){
        //             ans[i] = multi;
        //         } else {
        //             ans[i] = 0;
        //         }
        //     }
        // }
        // return ans;


        int[] ans = new int[nums.length];

        for(int i = 0; i < ans.length; i++){
            ans[i] = 1;
        }

        int left = 1;
        for(int i = 0; i < nums.length; i++){
            ans[i] = left;
            left = left * nums[i];
        }

        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }
}