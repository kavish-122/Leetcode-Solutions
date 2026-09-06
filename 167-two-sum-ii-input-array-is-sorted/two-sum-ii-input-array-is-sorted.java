class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int arr[] = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j] == target){
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            } else if(numbers[i]+numbers[j] < target){
                i++;
            } else {
                j--;
            }
        }
        return arr;

        // int[] arr = new int[2];
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < numbers.length; i++) {
        //     int complement = target - numbers[i];

        //     if(map.containsKey(complement)) {
        //         arr[0] = map.get(complement);
        //         arr[1] = i + 1;
        //         return arr;
        //     }

        //     map.put(numbers[i], i + 1);
        // }

        // return arr;
    }
}