class Solution {
    public void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void reverse(int[] nums, int low, int high){
        while(low < high){
            swap(nums,low,high);
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        //OPTIMAL SOLUTION
        k = k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums, 0, nums.length-1);

        //USING TEMPERORY ARRAY

        // k = k % nums.length;

        // int arr[] = new int[k];
        // for(int i = nums.length - k; i < nums.length; i++) {
        //     arr[i - (nums.length - k)] = nums[i];
        // }
        // int m = nums.length - 1;

        // for(int i = nums.length - k - 1; i >= 0; i--) {
        //     nums[m] = nums[i];
        //     m--;
        // }
        // for(int i = 0; i < k; i++) {
        //     nums[i] = arr[i];
        // }

        // USING HASHMAP

        // HashMap<Integer, Integer> map = new HashMap<>();
        // if(k>nums.length){
        //     k = k%nums.length;
        // }
        // int i=0; 
        // int j=nums.length-k;
        // int count = 0;
        // while(j<nums.length){
        //     map.put(count++,nums[j]);
        //     j++;
        // }
        // while(i<(nums.length-k)){
        //     map.put(count++,nums[i]);
        //     i++;
        // }
        // for(int m=0; m<map.size(); m++){
        //     nums[m] = map.get(m);
        // }

    }
}