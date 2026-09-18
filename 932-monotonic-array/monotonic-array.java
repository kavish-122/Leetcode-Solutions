class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }

            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}

// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         if(nums.length == 1){
//             return true;
//         }
//         if(nums.length == 2){
//             return true;
//         }
//         int i=0;
//         if(nums[i] <= nums[i+1]){
//             if(nums[i+1] )
//         }
//     }
// }