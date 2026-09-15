class Solution {
    public void duplicateZeros(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                map.put(k,arr[i]);
                k++;
            } else {
                list.add(i+list.size());
            }
        }
        if(list.isEmpty()){
            return;
        }
        k = 0;
        for(int i=0; i<arr.length; i++){
            if(list.contains(i)){
                arr[i] = 0;
                if((i+1) < arr.length){
                    arr[i+1] = 0;
                    i= i+1;
                }
            } else {
                arr[i] = map.get(k);
                k++;
            }
        }
    }
}