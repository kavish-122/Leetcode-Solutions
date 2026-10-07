class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;



        // int j=0;
        // int i;
        // for(i=0; i<nums.length; i++){
        //     if((i+k) < nums.length){
        //         j = i+k;
        //     } else {
        //         break;
        //     }
        //     int start = i;
        //     int end = j;
        //     while(start < end){
        //         if(nums[start] == nums[end]){
        //             return true;
        //         }
        //         end--;
        //     }
        //     j++;
        // }
        
        // while(i<nums.length){
        //     int start = i;
        //     int end = nums.length-1;
        //     while(start < end){
        //         if(nums[start] == nums[end]){
        //             return true;
        //         }
        //         end--;
        //     }
        //     i++;
        // }
        
        // return false;
    }
}