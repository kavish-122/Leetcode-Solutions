class Solution {
    public int singleNumber(int[] nums) {
        int sn = nums[0];
        for(int i=1; i<nums.length; i++){
            sn = sn^nums[i];
        }
        return sn;
    }
}