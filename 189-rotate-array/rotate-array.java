class Solution {
    public void rotate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(k>nums.length){
            k = k%nums.length;
        }
        int i=0;
        int j=nums.length-k;
        int count = 0;
        while(j<nums.length){
            map.put(count++,nums[j]);
            j++;
        }
        while(i<(nums.length-k)){
            map.put(count++,nums[i]);
            i++;
        }
        for(int m=0; m<map.size(); m++){
            nums[m] = map.get(m);
        }

    }
}