class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[nums.length];
        int s = 0;
        int sm = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                arr[s++] = nums[i];
            }else{
                map.put(sm++,nums[i]);
            }
        }
        for(int i=0; i<map.size(); i++){
            arr[s++] = map.get(i);
        }
        return arr;
    }
}