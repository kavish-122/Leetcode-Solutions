class Solution {
    public int[] shuffle(int[] nums, int n) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int k = 0;
        int m = 0;
        for(int i=0; i<nums.length; i++){
            if(i<n){
                map1.put(k,nums[i]);
                k++;
            } else {
                map2.put(m,nums[i]);
                m++;
            }
        }
        int arr[] = new int[2*n];
        k = 0;
        m = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                arr[i] = map1.get(k);
                k++;
            } else {
                arr[i] = map2.get(m);
                m++;
            }
        }
        return arr;
    }
}