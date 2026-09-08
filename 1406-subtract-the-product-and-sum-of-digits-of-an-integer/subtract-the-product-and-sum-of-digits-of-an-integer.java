class Solution {
    public int subtractProductAndSum(int n) {
        int n1 = n;
        int sod = 0;
        int pod = 1;
        while(n1 != 0){
            int r = n1%10;
            sod += r;
            pod *= r;
            n1 = n1/10;
        }
        return pod-sod;
    }
}