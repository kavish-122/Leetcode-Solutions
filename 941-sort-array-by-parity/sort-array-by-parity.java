class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            while(start < nums.length && nums[start]%2 == 0){
                start++;
            }
            while(end >= 0 && nums[end]%2 != 0){
                end--;
            }
            if(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        return nums;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // int arr[] = new int[nums.length];
        // int s = 0;
        // int sm = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]%2 == 0){
        //         arr[s++] = nums[i];
        //     }else{
        //         map.put(sm++,nums[i]);
        //     }
        // }
        // for(int i=0; i<map.size(); i++){
        //     arr[s++] = map.get(i);
        // }
        // return arr;
    }
}