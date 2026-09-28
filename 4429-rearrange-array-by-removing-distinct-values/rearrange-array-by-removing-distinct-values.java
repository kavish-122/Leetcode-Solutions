class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int index = 0;
        while (!map.isEmpty()) {
            Iterator<Integer> it = map.keySet().iterator();
            while(it.hasNext()){

                Integer num = it.next();
                ans[index++] = num;

                map.put(num, map.get(num) - 1);

                if (map.get(num) == 0) {
                    it.remove();
                }
            }
        }
        return ans;
    }
}