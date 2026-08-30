class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);
            if(!map2.containsKey(nums[i])){
                map2.put(nums[i],i);
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            if(!map3.containsKey(nums[i])){
                map3.put(nums[i],i);
            }
        }
        int count = 0;
        for(Integer key: map1.keySet()){
            int r = map3.get(key);
            int l = map2.get(key);
            int x = map1.get(key);
            if((r-l+1) == x){
                count++;
            }
        }
        return count;
        
    }
}