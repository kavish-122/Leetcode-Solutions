class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            map.put(sum,map.getOrDefault(sum,0)+1);
            sum += nums[i];
            int rem = sum-k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            
        }
        return count;
    }
}