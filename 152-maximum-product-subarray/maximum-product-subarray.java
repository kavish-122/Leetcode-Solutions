class Solution {
    public int maxProduct(int[] nums) {
        int maxN = nums[0];
        int maxP = nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            int tempP = maxP*nums[i];
            int tempN = maxN*nums[i];
            maxN = Integer.min(nums[i],Integer.min(tempP,tempN));
            maxP = Integer.max(nums[i],Integer.max(tempN,tempP));
            ans = Integer.max(maxP,ans);
        }
        
        return ans;
    }
}