class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length-1;
        if(nums[low] < nums[high]){
            return nums[low];
        }
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[low] <= nums[mid]){
                ans = Integer.min(ans,nums[low]);
                low = mid+1;
            } else {
                ans = Integer.min(ans,nums[mid]);
                high = mid-1;
            }

        }
        return ans; 
    }
}