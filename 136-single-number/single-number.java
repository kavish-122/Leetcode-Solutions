class Solution {
    public int singleNumber(int[] nums) {
        // OPTIMAL(USING XOR OPERATION)
        int sn = nums[0];
        for(int i=1; i<nums.length; i++){
            sn = sn^nums[i];
        }
        return sn;

        // USING HASHMAP

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // int ans = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(map.get(nums[i]) == 1){
        //         ans = nums[i];
        //     }
        // }
        // return ans;
    }
}