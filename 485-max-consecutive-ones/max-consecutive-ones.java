class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                if(i==0||nums[i-1] != 1){
                    count = 0;
                }
                count++;
                if(count>max){
                    max = count;
                }
            }
        }
        return max;
    }
}