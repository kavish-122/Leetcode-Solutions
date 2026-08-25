class Solution {
    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }
        if(j == -1) return;
        for(int i=j+1; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int k = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] != 0){
        //         map.put(k,nums[i]);
        //         k++;
        //     }
        // }
        // for(int i=0; i<map.size(); i++){
        //     nums[i] = map.get(i);
        // }
        // for(int i=map.size(); i<nums.length; i++){
        //     nums[i] = 0;
        // }
        
    }
}