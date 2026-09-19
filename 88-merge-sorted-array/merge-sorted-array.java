class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 0;
        for(int i=0; i<m; i++){
            map.put(k,nums1[i]);
            k++;
        }
        int l = 0;
        int a = 0;
        int count = 0;
        for(int i=0; i<nums1.length; i++){
            if(a<n && l<m){
                if(nums2[a] <= map.get(l)){
                    nums1[i] = nums2[a];
                    a++;
                } else {
                    nums1[i] = map.get(l);
                    l++;
                }
                count++;
            }
        }
        if(l<m){
            for(int i=count; i<nums1.length; i++){
                if(l<m){
                    nums1[i] = map.get(l);
                    l++;
                }
            }
        }else {
            for(int i=count; i<nums1.length; i++){
                if(a<n){
                    nums1[i] = nums2[a];
                    a++;
                }
            }
        }
    }
}