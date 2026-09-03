class Solution {
    public int[] shuffle(int[] nums, int n) {
        // CLEAN SOLUTION
        int arr[] = new int[2*n];
        int k = 0;
        int m = n;
        for(int i=0; i<n; i++){
            arr[k++] = nums[i];
            arr[k++] = nums[m++];
        }
        return arr;
        // OPTIMAL SOLUTION
        // int arr[] = new int[nums.length];
        // int s = 0;
        // int e = n;
        // for(int i=0; i<nums.length; i++){
        //     if(i%2 == 0){
        //         arr[i] = nums[s];
        //         s++;
        //     } else {
        //         arr[i] = nums[e];
        //         e++;
        //     }
        // }
        // return arr;

        // USING HASHMAP
        // HashMap<Integer,Integer> map1 = new HashMap<>();
        // HashMap<Integer,Integer> map2 = new HashMap<>();
        // int k = 0;
        // int m = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(i<n){
        //         map1.put(k,nums[i]);
        //         k++;
        //     } else {
        //         map2.put(m,nums[i]);
        //         m++;
        //     }
        // }
        // int arr[] = new int[2*n];
        // k = 0;
        // m = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(i%2 == 0){
        //         arr[i] = map1.get(k);
        //         k++;
        //     } else {
        //         arr[i] = map2.get(m);
        //         m++;
        //     }
        // }
        // return arr;
    }
}