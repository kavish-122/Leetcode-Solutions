class Solution {
    public void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    // FOR QUICK SORT

    // public int findPivot(int nums[], int low, int high){
    //     int p = nums[low];
    //     int i = low-1;
    //     int j = high+1;
    //     while(true){
    //         do{
    //             i++;
    //         } while(nums[i]<p);
    //         do{
    //             j--;
    //         } while(nums[j]>p);
    //         if(i>=j){
    //             return j;
    //         }
    //         swap(nums, i, j);
    //     }
    // }
    // public void quickSort(int nums[], int low, int high){
    //     if(low>=high){
    //         return;
    //     }
    //     int pivotIndex = findPivot(nums, low, high);
    //     quickSort(nums, low, pivotIndex);
    //     quickSort(nums, pivotIndex+1, high);
    // }
    
    public void sortColors(int[] nums) {
        // OPTIMAL SOLUTION WITH DUTCH NATIONAL FLAG ALGORITHM
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

        // BETTER SOLUTION - TIME COMPLEXITY - O(2*N)
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] == 0){
        //         count0++;
        //     }else if(nums[i] == 1){
        //         count1++;
        //     } else {
        //         count2++;
        //     }
        // }
        // int k = 0;
        // count1 += count0;
        // count2 += count1;
        // while(k<nums.length){
        //     if(k<count0){
        //         nums[k] = 0;
        //     } else if(k<count1){
        //         nums[k] = 1;
        //     } else {
        //         nums[k] = 2;
        //     }
        //     k++;
        // }
        

        // USING QUICK SORT

        // quickSort(nums,0,nums.length-1);

        // USING BUBBLE SORT
        // for(int j=nums.length-1; j>=0; j--){
        //     for(int i=0; i<j; i++){
        //         if(nums[i] > nums[i+1]){
        //             swap(nums,i,i+1);
        //         }
        //     }
        // }
    }
}