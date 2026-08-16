class Solution {
    public int majorityElement(int[] nums) {

//  USING BOYER-MOORE VOTING ALGORITHM

        int candidate = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(count <= 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            } else {
                count--;
            }
            
        }
        
        return candidate;

// USING HASHMAP

        // int k = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int i=0; i<nums.length; i++){
        //     if(map.get(nums[i]) > nums.length/2){
        //         k = nums[i];
        //         break;
                
        //     }
        // }
        // return k;
    }
}