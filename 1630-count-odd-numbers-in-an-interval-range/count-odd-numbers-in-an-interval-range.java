class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        int i = low;
        if(i%2 != 0){
            count++;
            for(int j = i+2; j<=high; j=j+2){
                count++;
            }
        }else{
            for(int k = i+1; k<=high; k=k+2){
                count++;
            }
        }
        // for(int i=low; i<=high; i++){
        //     if(i%2 != 0){
        //         count++;
        //     }
        // }
        return count;
    }

}