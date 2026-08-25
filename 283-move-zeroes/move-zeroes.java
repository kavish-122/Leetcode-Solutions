class Solution {
    public void moveZeroes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                map.put(k,nums[i]);
                k++;
            }
        }
        for(int i=0; i<map.size(); i++){
            nums[i] = map.get(i);
        }
        for(int i=map.size(); i<nums.length; i++){
            nums[i] = 0;
        }
        
    }
}