class Solution {
    public boolean check(int[] nums) {
        int dCount = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                dCount++;
            }
        }
        if(nums[nums.length-1] > nums[0]){
            dCount++;
        }

        if(dCount > 1){
            return false;
        }
        return true;
    }
}