class Solution {
    // public int findUpperBound(int[] nums, int target){
    //     int lp = nums.length;
    //     int low = 0;
    //     int high = nums.length-1;
    //     while(low<=high){
    //         int mid = (low+high)/2;
    //         if(nums[mid] > target){
    //             lp = mid;
    //             high = mid-1;
    //         } else {
                
    //             low = mid+1;
    //         }
    //     }
    //     return lp-1;
    // }    
    // public int findLowerBound(int[] nums, int target){
    //     int fp = nums.length;
    //     int low = 0;
    //     int high = nums.length-1;
    //     while(low<=high){
    //         int mid = (low+high)/2;
    //         if(nums[mid] >= target){
    //             fp = mid;
    //             high = mid-1;
    //         } else {
    //             low = mid+1;
    //         }
    //     }
    //     return fp;
    // }
    public int[] searchRange(int[] nums, int target) {
        // if(nums.length < 1){
        //     return new int[]{-1,-1};
        // }
        // int fp = findLowerBound(nums,target);
        // if(fp == nums.length || nums[fp] != target) return new int[]{-1,-1};
        // return new int[]{fp,findUpperBound(nums,target)};

        int fp = -1;
        int lp = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] >= target){
                fp  = mid;
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
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] <= target){
                lp = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return new int[]{fp,lp};
    }
}