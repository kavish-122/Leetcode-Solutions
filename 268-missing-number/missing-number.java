class Solution {
    public int missingNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],1);
        }

        for(int i=0; i<nums.length; i++){
            if(map.get(i) == null){
                return i;
            }
        }
        return nums.length;





        // for(int i=0; i<nums.length; i++){
        //     int flag = 0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[j] == i){
        //             flag = 1;
        //             break;
        //         }
        //     }
            
        // }
        // if(flag == 0){
        //     return i;
        // }
        // return nums.length+1;
    }
}