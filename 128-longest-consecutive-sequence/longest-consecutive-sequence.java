class Solution {
    public int longestConsecutive(int[] nums) {
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
        // HashMap<Integer,Boolean> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],true);
        // }
        // int count = 0;
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     if(!map.containsKey(nums[i]-1)){
        //         if(map.containsKey(nums[i]+1)){
        //             count++;
        //         }
        //     }
        // }
        // return count+1;
    }
}