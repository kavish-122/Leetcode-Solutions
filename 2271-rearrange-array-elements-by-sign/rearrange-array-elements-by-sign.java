class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int p = 0;
        int n = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                map1.put(p,nums[i]);
                p++;
            } else {
                map2.put(n,nums[i]);
                n++;
            }
        }
        int rearrangeArray[] = new int[nums.length];
        int pt = 0;
        int nt = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0 && pt<map1.size()){
                rearrangeArray[i] = map1.get(pt++);
            } 
            if(i%2 != 0 && nt<map2.size()){
                rearrangeArray[i] = map2.get(nt++);
            }
        }
        return rearrangeArray;
    }
}