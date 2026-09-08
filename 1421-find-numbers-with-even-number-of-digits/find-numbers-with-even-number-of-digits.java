class Solution {
    public int findDigits(int[] nums, int value){
        int n1 = value;
        int count = 0;
        while(n1 != 0){
            n1 = n1/10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int c = findDigits(nums, nums[i]);
            if(c%2 == 0){
                count++;
            }
        }
        return count;

    }
}