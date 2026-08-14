class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) == true){
                arr[0] = map.get(nums[i]);
                arr[1] = i;
                break;
            }
            map.put(target-nums[i],i);
            
        }
        return arr;
    }
}