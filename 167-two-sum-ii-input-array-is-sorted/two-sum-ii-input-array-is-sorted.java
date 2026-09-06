class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if(map.containsKey(complement)) {
                arr[0] = map.get(complement);
                arr[1] = i + 1;
                return arr;
            }

            map.put(numbers[i], i + 1);
        }

        return arr;
    }
}