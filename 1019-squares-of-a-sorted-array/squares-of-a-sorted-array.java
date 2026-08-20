class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        for(int k=nums.length-1; k>=0; k--){
            if(Math.abs(nums[j])*Math.abs(nums[j]) > Math.abs(nums[i])*Math.abs(nums[i])){
                arr[k] = Math.abs(nums[j])*Math.abs(nums[j]);
                j--; 
            } else {
                
                arr[k] = Math.abs(nums[i])*Math.abs(nums[i]);
                i++;
            }
        }
        return arr;
    }
}