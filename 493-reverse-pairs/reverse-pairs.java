class Solution {
    public void merge(int[] nums, int low, int mid, int high){
        int temp[] = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }
        while(left <= mid){
            temp[k++] = nums[left++];
        }
        while(right <= high ){
            temp[k++] = nums[right++];
        }
        for(int i=low; i<=high; i++){
            nums[i] = temp[i-low];
        }
    }
    public int countRP(int[] nums, int low , int mid, int high){
        int count = 0;
        int right = mid+1;
        for(int i=low; i<mid+1; i++){
            while(right<=high && (long)nums[i] > (long)2*nums[right]){
                right++;
            }
            count += (right-(mid+1));
        }
        return count;
    }
    public int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low >= high){
            return count;
        }
        int mid = (low+high)/2;
        count += mergeSort(nums,low,mid);
        count += mergeSort(nums,mid+1,high);
        count += countRP(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);

//  BRUTE FORCE
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if((long)nums[i] > ((long)2*nums[j])){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}