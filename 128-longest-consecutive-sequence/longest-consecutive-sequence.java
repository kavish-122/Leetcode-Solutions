class Solution {
    public int longestConsecutive(int[] nums) {
        
        // USING SORT METHOD

        if(nums.length < 1){
            return 0;
        }
        Arrays.sort(nums);
        int largest = 1;
        int count = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1 == nums[i+1]){
                count++;
            } else {
                if(nums[i] != nums[i+1]){
                    count = 1;
                }
            }
            largest = Integer.max(count, largest);
        }
        return largest;

        // USING HASHSET

        // if(nums.length == 0){
        //     return 0;
        // }
        // Set<Integer> set = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     set.add(nums[i]);
        // }
        // int largest = 1;

        // for(int v:set){
        //     int count = 1;
        //     if(!set.contains(v-1)){
        //         int x = v;
        //         while(set.contains(x+1)){
        //             count++;
        //             x++;
        //         }
        //         largest = Integer.max(count,largest);
        //     }
        // }

        // return largest;    
    }
}