class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fp = -1, lp = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
                fp = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        if(fp == -1 || nums[fp] != target){
            return new int[]{-1,-1};
        }
        low = 0;
        high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (nums[mid] <= target) {
                lp = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(lp == -1 && fp != -1){
            lp = fp;
        }
        return new int[]{fp,lp};
    }
}